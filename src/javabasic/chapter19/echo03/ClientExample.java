package javabasic.chapter19.echo03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1", 10000)){
            System.out.println("소켓에 연결");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());

            Scanner scan = new Scanner(System.in);
            System.out.print("서버에 보낼 메세지 : ");
            String line = scan.nextLine();

            pw.println(line);
            pw.flush();

            String receiveLine = br.readLine();
            System.out.println("서버에서 받은 메세지"+receiveLine);
            System.out.println("연결 종료");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
