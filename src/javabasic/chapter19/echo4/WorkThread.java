package javabasic.chapter19.echo4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WorkThread extends Thread{
    Socket socket;

    public WorkThread(Socket socket) {
        super();
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());

            String line = br.readLine();
            System.out.println(": 받은 메세지 "+line);

            pw.println(line);
            pw.flush();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
