package javabasic.chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String originalFileName = "C:/temp/angel.jpg";
        String targetFileName = "C:/temp/angel_copy.jpg";
        try {
            FileInputStream fis = new FileInputStream(originalFileName);
            FileOutputStream fos = new FileOutputStream(targetFileName);
            int readByteNo;
            byte[] readBytes = new byte[100];
            while ((readByteNo = fis.read(readBytes)) != -1) {
                fos.write(readBytes, 0, readByteNo);
            }
            fos.flush();
            System.out.println("복사완료");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
