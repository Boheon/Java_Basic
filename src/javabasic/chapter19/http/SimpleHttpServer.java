package javabasic.chapter19.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {
    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(80);){
            System.out.println("");
            System.out.println("");

            while(true){
                Socket socket = serverSocket.accept();//소켓 연결
                System.out.println("소켓이 연결가능합니다");

                BufferedReader r = new BufferedReader(new InputStreamReader((socket.getInputStream())));

                //1.
                String line = r.readLine();
                System.out.println(line);
                String[] url = line.split(" ");
                System.out.println(" : " + url[1]);

                //2.
                while(true){
                    line = r.readLine();
                    if(line.equals("")){
                        break;
                    }
                    System.out.println(line);

                //3. Body - GET

                    //
                    PrintWriter w = new PrintWriter(socket.getOutputStream());
                    //1.
                    w.println("HTTP/1.1 200 OK");

                    //2.
                    w.println("Content-type: text/html");
                    w.println();//

                    //3. body
                    w.println("<html>");
                    w.println("<body><h1>Hi, Everyone</h1></body>");
                    w.println("</html>");
                    w.flush();
                    socket.close();
                }

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
