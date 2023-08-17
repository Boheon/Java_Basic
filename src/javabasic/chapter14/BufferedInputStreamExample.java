package javabasic.chapter14;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws IOException {
        long start = 0;
        long end = 0;

        FileInputStream fis1 = new FileInputStream("C:/Temp/angel.jpg");
        start = System.currentTimeMillis();
        while (fis1.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("사용하지 않을 때 : " + (end - start) + "ms");
        fis1.close();


        start = 0;
        end = 0;

        FileInputStream fis2 = new FileInputStream("C:/Temp/angel.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        start = System.currentTimeMillis();
        while (bis.read() != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("사용하지 않을 때 : " + (end - start) + "ms");
        bis.close();
    }
}
