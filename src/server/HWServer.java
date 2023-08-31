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

        try {
            server = new ServerSocket(port);
            socket = server.accept();
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            scanner = new Scanner(System.in);

            new Thread(() -> {

                while (true) {
                    String str = null;
                    try {
                        str = in.readUTF();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (str.equals("/q")){
                        break;
                    }
                    System.out.println(str);
                }
            }).start();


            new Thread(() -> {
                while (true) {
                    String str = scanner.nextLine();
                    if (str.equals("/q")){
                        break;
                    }
                    try {
                        out.writeUTF(str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            }).start();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
