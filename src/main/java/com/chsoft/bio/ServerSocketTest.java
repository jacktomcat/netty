package com.chsoft.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("启动serverSocket......");

            //while(true) {
                Socket socket = serverSocket.accept();
                System.out.println("接收到一个客户端连接,ip=" + socket.getLocalAddress() + ", port=" + socket.getPort());

                InputStream inputStream = socket.getInputStream();
                new Thread(() -> {
                    try {
                        byte[] data = new byte[1024];
                        int read = inputStream.read(data);
                        while (read != -1) {
                            System.out.println(new String(data, "utf-8"));
                            read = inputStream.read(data);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            //}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
