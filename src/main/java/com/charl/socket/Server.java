package com.charl.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;

    public Server(int port) {
        try {
            this.serverSocket = new ServerSocket(port);
            System.out.println("服务端启动成功...");
        } catch (IOException e) {
            System.out.println("服务端启动异常...");
        }
    }

    public void start() {
        new Thread(() -> {
            doStart();
        }).start();
    }

    private void doStart() {
        while (true) {
            try {
                Socket client = serverSocket.accept();
                System.out.println("新客户端接入");
                new ClientHandler(client).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
