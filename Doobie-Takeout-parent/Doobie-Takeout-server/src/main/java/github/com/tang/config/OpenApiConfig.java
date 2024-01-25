package github.com.tang.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: OpenApiConfig
 * @Author hui20-hub
 * @Package github.com.tang.config
 * @Date 2024/1/7 12:34
 */

public class OpenApiConfig {
    @Bean
    public OpenAPI springBootOpenApi() {
        return new OpenAPI()
                // 接口文档标题
                .info(new Info().title("Knife4j OpenApi 3")
                        // 接口文档描述
                        .description("Knife4j OpenApi 3 application")
                        // 接口文档版本
                        .version("v1.0")
                        // 开发者联系方式
                        .contact(new Contact().name("hui20-hub").url("https://github.com/hui20-hub")))
                .externalDocs(new ExternalDocumentation()
                        // 额外补充说明
                        .description("Github")
                        // 额外补充链接
                        .url("https://github.com/hui20-hub"));
    }
}
