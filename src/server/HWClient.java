package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HWClient {
    private static DataInputStream in;
    private static DataOutputStream out;
    private final static int PORT = 8981;
    private final static String ADDRESS = "localhost";
    private static Scanner scanner;
    private static Socket socket;

    public static void main(String[] args) {
        try {
            scanner = new Scanner(System.in);
            socket = new Socket(ADDRESS, PORT);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                while (true) {
                    String str = null;
                    try {
                        str = in.readUTF();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(str);
                }
            }).start();

            new Thread(() -> {
                while (true) {
                    String str = scanner.nextLine();
                    try {
                        out.writeUTF(str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            }).start();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
