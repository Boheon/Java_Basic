package javabasic.chapter10;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try{
            Class clazz = Class.forName("java.lang.String");
            System.out.println(clazz);
            return;
        }catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다.");
            //e.printStackTrace();
        }finally {
            System.out.println("=================================");//return을 하더라도 실행됨
        }
        System.out.println("프로그램종료");
    }
}
