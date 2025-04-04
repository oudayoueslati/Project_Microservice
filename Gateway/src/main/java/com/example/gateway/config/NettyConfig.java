package com.example.gateway.config;

import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelDuplexHandler;
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.embedded.netty.NettyServerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.netty.http.server.HttpServer;

@Configuration
public class NettyConfig {

    @Bean
    public NettyReactiveWebServerFactory nettyReactiveWebServerFactory() {
        NettyReactiveWebServerFactory factory = new NettyReactiveWebServerFactory();
        factory.addServerCustomizers(new HeaderCleanupCustomizer());
        return factory;
    }

    static class HeaderCleanupCustomizer implements NettyServerCustomizer {
        @Override
        public HttpServer apply(HttpServer httpServer) {
            return httpServer
                    // ⬅️ On ajoute la ligne suivante pour augmenter la taille max des en-têtes
                    .httpRequestDecoder(spec -> spec.maxHeaderSize(65536)) // 64 KB
                    .doOnConnection(connection ->
                            connection.addHandlerLast("header-cleanup", new HeaderCleanupHandler())
                    );
        }
    }

    static class HeaderCleanupHandler extends ChannelDuplexHandler {
        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            if (msg instanceof HttpRequest) {
                HttpRequest request = (HttpRequest) msg;
                HttpHeaders headers = request.headers();
                headers.remove("Forwarded");
                System.out.println("Headers after cleanup: " + headers);
            }
            super.channelRead(ctx, msg);
        }
    }
}
