package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.embedded.netty.NettyServerCustomizer;
import io.netty.handler.codec.http.HttpObjectDecoder;
import reactor.netty.http.server.HttpServer;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public NettyServerCustomizer nettyServerCustomizer() {
        return httpServer -> httpServer.httpRequestDecoder(spec -> spec
                .maxHeaderSize(65536) // Augmente la limite des en-têtes à 64 Ko
                .maxInitialLineLength(4096));
    }
    @Bean
    public GlobalFilter customGlobalFilter() {
        Logger logger = LoggerFactory.getLogger(GatewayApplication.class);
        return new GlobalFilter() {
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                logger.info("CustomGlobalFilter: Cleaning up headers...");
                ServerWebExchange modifiedExchange = exchange.mutate()
                        .request(r -> r.headers(headers -> {
                            logger.debug("Removing Content-Length header...");
                            headers.remove("Content-Length");
                            logger.debug("Removing Forwarded headers...");
                            headers.remove("Forwarded");
                            logger.debug("Removing X-Forwarded-* headers...");
                            headers.remove("X-Forwarded-For");
                            headers.remove("X-Forwarded-Proto");
                            headers.remove("X-Forwarded-Port");
                            headers.remove("X-Forwarded-Host");
                        }))
                        .build();
                return chain.filter(modifiedExchange);
            }


            public int getOrder() {
                return Ordered.HIGHEST_PRECEDENCE; // Exécuter ce filtre en premier
            }
        };
    }
}
