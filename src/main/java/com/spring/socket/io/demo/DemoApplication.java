package com.spring.socket.io.demo;

import com.corundumstudio.socketio.SocketIOServer;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication {
  private final SocketIOServer server;
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @PreDestroy
  public void destroy() {
    server.stop();
  }

}
