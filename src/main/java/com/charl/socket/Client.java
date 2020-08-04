package com.charl.socket;

import java.io.IOException;
import java.net.Socket;

public class Client {

    private static String host = "127.0.0.1";

    private static int port = 8000;

    public static void main(String[] args) throws IOException {
        final Socket socket = new Socket(host, port);
        new Thread(() -> {
            System.out.println("客户端启动成功");
            while (true) {
                try {
                    String message = "hello charl";
                    System.out.println("客户端发送消息：" + message);
                    socket.getOutputStream().write(message.getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                sleep();
            }

        }).start();
    }

    private static void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
