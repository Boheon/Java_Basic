package javabasic.chapter14;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:/temp/test.txt");

        int readCharNo;
        char[] cbuf = new char[100];
        while((readCharNo=fr.read(cbuf)) != -1){
            String data = new String(cbuf, 0, readCharNo);
            //System.out.println(data);//문자열(읽은 데이터만)
            System.out.println(cbuf);//배열 출력(100byte)전부
        }
        fr.close();
    }
}
