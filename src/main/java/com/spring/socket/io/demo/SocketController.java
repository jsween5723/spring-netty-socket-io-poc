package com.spring.socket.io.demo;

import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.annotation.OnConnect;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class SocketController {
  private final SocketIOServer server;

  @OnConnect
  public void connect(SocketIOClient client) {
    log.info("connected");
  }
}
