package com.certicom.carrito.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Carrito de compra API",
                version = "1.0",
                description = "Documentación para Endpoints en Carrito de compra"
        )
)
public class OpenApiConfig {
}
