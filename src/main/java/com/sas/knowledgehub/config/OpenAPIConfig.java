package com.sas.knowledgehub.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

  @Bean
  public OpenAPI openAPI() {

    Info info = new Info()
        .title("Knowledge Hub API")
        .version("1.0")
        .description("This API exposes endpoints to manage tutorials.");

    return new OpenAPI().info(info);
  }
}