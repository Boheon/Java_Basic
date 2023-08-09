package javabasic.chapter10;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            findClass();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void findClass() throws ClassNotFoundException{//예외 떠넘기기
        Class clazz = Class.forName("java.lang.String2");
    }
}
