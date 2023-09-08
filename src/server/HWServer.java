package server;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HWServer {
    private static DataInputStream in;
    private static DataOutputStream out;
    private static int port = 8981;
    private static ServerSocket server;
    private static Socket socket;
    private static Scanner scanner;


    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(port)) {
            socket = server.accept();
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            scanner = new Scanner(System.in);

            Thread reader = new Thread(() -> {
                while (true) {
                    try {
                        out.writeUTF(scanner.nextLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }

            });
            reader.setDaemon(true);
            reader.start();


            while (true) {
                String str = in.readUTF();
                if (str.equals("/q")) {
                    System.out.println("client was disconnected");
                    break;
                } else {
                    System.out.println(str);
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
