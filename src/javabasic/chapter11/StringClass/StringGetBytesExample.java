package javabasic.chapter11.StringClass;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringGetBytesExample {
    public static void main(String[] args) {
        String str = "안녕하세요";

        byte[] bytes1 = str.getBytes();
        System.out.println("byte1.length : "+bytes1.length);//euckr=>10 utf-8 =>15
        String str1 = new String(bytes1);
        System.out.println("bytes->String : "+str1);

        try{
            byte[] bytes2 = str.getBytes("EUC-KR");
            System.out.println("byte2.length : "+bytes2.length);
            String str2 = new String(bytes2, "EUC-KR");
            System.out.println("bytes2->String : "+str2);

            byte[] bytes3 = str.getBytes("UTF-8");
            System.out.println("byte3.length : "+bytes3.length);
            String str3 = new String(bytes3, "EUC-KR");
            System.out.println("bytes3->String : "+str3);
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}
