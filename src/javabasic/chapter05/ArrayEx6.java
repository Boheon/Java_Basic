package javabasic.chapter05;

public class ArrayEx6 {
    public static void main(String[] args) {
        String str = new String("Hello");

        str = new String("World");

        String str2 = new String("World");
        str = str2;

        str = null;
    }
}
