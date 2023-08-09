package javabasic.chapter10;

import java.io.IOException;

public class NullPointerExceptionExample {
    public static void main(String[] args) throws IOException {
        String data = null;
        System.out.println(data.toString());

        System.in.read();
    }
}
