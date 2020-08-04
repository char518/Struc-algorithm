package com.charl.socket;

public class ServerBoot {

    private static int port = 8000;

    public static void main(String[] args) {
        Server server = new Server(port);
        server.start();
    }

}
