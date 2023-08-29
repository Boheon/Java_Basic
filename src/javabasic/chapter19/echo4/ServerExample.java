package javabasic.chapter19.echo4;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(10000);){
            System.out.println("소켓 생성");
            System.out.println("서버가 열렸습니다.");

            while(true){
                Socket socket = serverSocket.accept();//서버 소켓 연결 수용
                System.out.println("연결을 수용합니다");

                //스레드에 할당
                Thread t = new WorkThread(socket);
                t.start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
