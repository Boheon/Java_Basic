package javabasic.chapter19.echo02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class ServerExample {
    public static void main(String[] args) {
        Socket socket = null;

        try(ServerSocket serverSocket = new ServerSocket(10000);){
            System.out.println("소켓 생성");
            System.out.println("");

            socket = serverSocket.accept();
            System.out.println("소켓에 연결");

            BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter w = new PrintWriter(socket.getOutputStream());

            String line = r.readLine();
            System.out.println(" : 클라이언트에서 받은 메세지"+line);
            w.println(line);
            w.flush();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
