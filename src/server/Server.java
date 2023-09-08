package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static ServerSocket server;
    private static Socket socket;
    private final static int PORT = 8189;


    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            System.out.println("server was started");

            socket = server.accept();
            System.out.println("client was connected");

            Scanner scanner = new Scanner(socket.getInputStream());
            while (true){
                String str = scanner.nextLine();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                if (str.equals("/q")){
                    break;
                }
                System.out.println("Client was: "+ str);
                out.println("ECHO: " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
