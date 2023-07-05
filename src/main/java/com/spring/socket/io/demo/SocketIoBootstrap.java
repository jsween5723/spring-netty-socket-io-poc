package com.spring.socket.io.demo;

import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.SpringAnnotationScanner;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SocketIoBootstrap implements CommandLineRunner {
  private final SocketIOServer server;

  @Bean
  public SpringAnnotationScanner scanner() {
    return new SpringAnnotationScanner(server);
  }
  @Override
  public void run(String... args) throws Exception {
    server.start();
  }
}
