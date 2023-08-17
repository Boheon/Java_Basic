package javabasic.chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("C:/temp/test.txt")){
            int data;
            while( (data = fis.read())!=-1){//1byte씩 읽고 콘솔에 출력
                System.out.write(data);
            }
            System.out.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
//        finally {
//            try {
//                System.out.println("파일 닫기");
//                if(fis != null) {
//                    fis.close();//파일이름이 달라지면 fis가 null이된다.
//                }
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }
    }
}
