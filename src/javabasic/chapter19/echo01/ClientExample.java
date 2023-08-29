package javabasic.chapter19.echo01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 10000)) {
            System.out.println("소켓 생성");
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            String str = "Hello, Server";
            out.write(str.getBytes());
            out.flush();
            System.out.println("클라이언트 : " + str);

            byte[] arr = new byte[100];
            in.read(arr);
            System.out.print("서버 : ");
            System.out.println(new String(arr));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
