package javabasic.chapter06.sec1;

import javabasic.chapter06.sec2.TV;

public class MyRoom {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.color = "검정";
        p1.shape = "폴더";
        p1.internet();

        Phone p2 = new Phone();
        p2.color = "빨강";
        p2.shape = "네모";
        p2.kakaoTalk();

        System.out.println(p1.color);
        System.out.println(p2.shape);

    }
}
