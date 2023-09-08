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

            Thread reader = new Thread(() -> {
                try {
                    while (true) {
                        out.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


            });
            reader.setDaemon(true);
            reader.start();


            while (true) {
                String str = in.readUTF();
                if (str.equals("/q")) {
                    System.out.println("client was disconnected");
                    out.writeUTF("/q");
                    break;
                } else {
                    System.out.println(str);
                }

            }

        } catch (Exception e) {
            //    e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }


    }
}
