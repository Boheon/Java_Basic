package javabasic.chapter04;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {//짝수
                sum += i;
            }
        }
        System.out.println("1 - 100까지의 짝수 합 : " + sum);

        sum = 0;
        for(int i = 2; i <=100; i += 2){
            sum+=i;
        }
        System.out.println("1 - 100까지의 짝수 합 : " + sum);

        //사용자의 입력값까지 짝수의 합구하기;
        sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력하시오 : ");
        int num = scan.nextInt();

        for(int i = 2; i <= num; i+=2){
            sum += i;
        }
        System.out.printf("1 - %d까지 짝수 합 : %d", num, sum);
    }


}
