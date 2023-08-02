package javabasic.chapter05;


import static javabasic.chapter05.ArrayUtil.*;

public class ArrayEx8 {
    public static void main(String[] args) {
        //5개의 점수를 받아서 평균을 출력
        int[] score = new int[5];

        getNumbers("점수 >> ", score);
        showNumbers(score);
        int sum = addAll(score);

        double avg = sum / score.length;

        System.out.println("평균 : "+avg);
    }
}
