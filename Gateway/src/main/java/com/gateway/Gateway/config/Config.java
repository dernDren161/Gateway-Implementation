package com.gateway.Gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.RouteLocatorDsl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){

        return builder.routes()
                .route(r -> r.path("/serviceOne/**")
                .uri("http://localhost:8081")
                .id("first"))

                .route(r -> r.path("/serviceTwo/**")
                .uri("http://localhost:8082")
                .id("second"))

                .build();

    }
}
