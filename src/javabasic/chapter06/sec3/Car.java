package javabasic.chapter06.sec3;

public class Car {

    String color; // 같은 패키지에서는 접근 가능

    public void run(){
        System.out.println("부릉부릉");
    }

    public void up(){
        System.out.println("속도증가!");
    }
}
