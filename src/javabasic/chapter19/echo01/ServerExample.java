package javabasic.chapter19.echo01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        Socket socket = null;

        try(ServerSocket serverSocket = new ServerSocket(10000);){
            System.out.println("서버 생성");
            System.out.println("포트번호 : 10000");

            socket = serverSocket.accept();//서버 연결
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            byte arr[] = new byte[100];
            in.read(arr);
            System.out.println(" :"+new String(arr));

            String str = "Hello, Client";
            out.write(str.getBytes());
            out.flush();
            System.out.println(" : "+ str);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
