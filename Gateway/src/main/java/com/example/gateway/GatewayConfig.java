package com.example.gateway;

import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GatewayConfig {

    @Bean
    public WebServerFactoryCustomizer<NettyReactiveWebServerFactory> nettyServerCustomizer() {
        return factory -> factory.addServerCustomizers(httpServer ->
                httpServer
                        .httpRequestDecoder(spec -> spec.maxHeaderSize(65536)) // 64KB
                        .doOnConnection(connection ->
                                connection.addHandlerFirst("headerFilter", new ChannelInboundHandlerAdapter() {
                                    @Override
                                    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                        if (msg instanceof HttpRequest) {
                                            HttpRequest request = (HttpRequest) msg;

                                            request.headers().remove("Forwarded");
                                        }
                                        super.channelRead(ctx, msg);
                                    }
                                })
                        )
        );
    }
}