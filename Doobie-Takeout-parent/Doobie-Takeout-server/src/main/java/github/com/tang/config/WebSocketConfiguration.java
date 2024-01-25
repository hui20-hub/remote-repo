package github.com.tang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @msg: WebSocket配置类，用于注册WebSocket的Bean
 * @Title: WebSocketConfiguration
 * @Author hui20-hub
 * @Package github.com.tang.config
 * @Date 2024/1/19 15:06
 */


@Configuration
public class WebSocketConfiguration {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
