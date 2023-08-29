package javabasic.chapter19.echo02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1", 10000)){
            System.out.println("소켓 10000번 포트에 연결");
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter w = new PrintWriter(socket.getOutputStream());

            Scanner s = new Scanner(System.in);
            System.out.print("서버에 보낼 텍스트를 입력해주세요 : ");
            String line = s.nextLine();//입력값받기

            w.println(line);
            w.flush();

            String receiveLine = br.readLine();
            System.out.println("서버에서 받은 메세지 : "+receiveLine);
            System.out.println("서버를 종료합니다.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
