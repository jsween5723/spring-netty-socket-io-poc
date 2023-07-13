package com.spring.socket.io.demo;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.SpringAnnotationScanner;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SocketIOBootstrap extends SpringAnnotationScanner {
  private static final SocketIOServer server = staticServer();
  public SocketIOBootstrap() {
    super(server);
  }

  @Bean
  public SocketIOServer server() {
    return server;
  }
  static private SocketIOServer staticServer() {
    return new SocketIOServer(configuration());
  }
  static private Configuration configuration() {
    Configuration configuration = new Configuration();
    configuration.setPort(8082);
    configuration.setHostname("localhost");
    return configuration;
  }

  @PostConstruct
  public void start() {
    server.start();
  }


}
