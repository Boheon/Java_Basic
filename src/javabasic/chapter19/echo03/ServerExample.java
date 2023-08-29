package javabasic.chapter19.echo03;

import javabasic.chapter08.sec01.B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        Socket socket = null;

        try(ServerSocket serverSocket = new ServerSocket(10000);){
            System.out.println("소켓 생성");
            System.out.println("소켓 번호 : 10000");

            while(true){
                socket = serverSocket.accept();
                System.out.println("소켓에 연결 수용");

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                PrintWriter pw = new PrintWriter(socket.getOutputStream());

                String line = br.readLine();
                System.out.println("클라이언트에서 받은 글 : "+line);

                pw.println(line);
                pw.flush();
                socket.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
