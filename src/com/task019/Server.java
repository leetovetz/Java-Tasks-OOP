package com.task019;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {      //Create a server socket on port 8189
            while (true) {      //Infinitely accepting requests
                Socket socket = serverSocket.accept();      //Accept the request
                new Thread(new MyServer(socket)).start();   //Create a new thread
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyServer implements Runnable {
    Socket socket;


    public MyServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(socket.getInputStream())) {
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Name of the OS: " + System.getProperty("os.name") +
                    "\nVersion of the OS: " + System.getProperty("os.version") +
                    "\nArchitecture of THe OS: " + System.getProperty("os.arch") +
                    "\nUser name: " + System.getProperty("user.name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}