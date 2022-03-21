package io.app.fiztec.customerapiv1.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Customer")
                        .description("Customer API")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Fidel Villanueva")
                                .url("https://api.fvillanueva.com.pe")
                                .email("fvillanueva.pe@gmail.com"))
                        .termsOfService("TOC")
                        .license(new License().name("License").url("#"))
                );
    }
}