package javabasic.chapter19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        InetAddress local = null;
        try {
            local = InetAddress.getLocalHost();

            //gethostAddress : String타입
            System.out.println("IP 주소는 " + local.getHostAddress());

            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            for (InetAddress remote : iaArr) {
                System.out.println("www.naver.com의 IP주소 : " + remote.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
