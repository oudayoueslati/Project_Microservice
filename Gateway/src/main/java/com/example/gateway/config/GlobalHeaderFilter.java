package com.example.gateway.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class GlobalHeaderFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // Supprime les en-têtes Forwarded
        exchange.getRequest().mutate().headers(headers -> headers.remove("Forwarded")).build();
        // Log pour débogage
        System.out.println("Headers after removing Forwarded: " + exchange.getRequest().getHeaders());
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE; // S'assure que ce filtre est exécuté en premier
    }
}