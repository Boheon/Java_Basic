package javabasic.chapter03;

public class inputTwo {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 4;

        System.out.println(n1+n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);//정수 ... 정수 / 정수 = 정수
        System.out.println(n1 / 4.0);// 실수/정수 정수/실수 = 실수

        System.out.println((double) (n1/n2));//n1/n2(정수)를 실수 표현하여 원하던 결과가 나오지 않았다.

     }
}
