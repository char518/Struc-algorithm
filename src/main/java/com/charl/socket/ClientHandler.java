package com.charl.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientHandler {

    private int MAX_LEN = 1024;

    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void start() {
        new Thread(() -> {
            handle();
        }).start();
    }

    private void handle() {
        try {
            InputStream inputStream = socket.getInputStream();
            while (true) {
                byte[] date = new byte[MAX_LEN];
                int len;
                while ((len = inputStream.read(date)) != -1) {
                    String message = new String(date, 0, len);
                    System.out.println("客户端传来消息：" + message);
                    socket.getOutputStream().write(date);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
