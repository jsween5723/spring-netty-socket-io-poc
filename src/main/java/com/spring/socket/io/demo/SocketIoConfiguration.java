package com.spring.socket.io.demo;

import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SocketIoConfiguration {
  @Value("${socket.io.hostname:localhost}")
  private String hostname;

  @Value("${socket.io.port:8082}")
  private int port;

  @Bean
  public SocketIOServer server(com.corundumstudio.socketio.Configuration configuration) {
    return new SocketIOServer(configuration);
  }

  @Bean
  public com.corundumstudio.socketio.Configuration configuration() {
    com.corundumstudio.socketio.Configuration configuration = new com.corundumstudio.socketio.Configuration();
    configuration.setHostname(hostname);
    configuration.setPort(port);
    return configuration;
  }
}
