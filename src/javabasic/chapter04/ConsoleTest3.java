package javabasic.chapter04;

import javax.swing.*;

public class ConsoleTest3 {
    public static void main(String[] args) {
        double value = 12.345678;
        String result = "작은값";

        System.out.printf("계산 결과는 %f입니다.\n", value);
        System.out.printf("계산 결과는 %.3f입니다.\n", value);
        System.out.printf("%s의 값은 %f입니다.\n", result, value);
    }



}
