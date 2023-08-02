package javabasic.chapter05;

import java.util.Scanner;

import static javabasic.chapter05.ArrayUtil.*;

public class ArrayEx7 {



    public static void main(String[] args) {
        //1. 배열만들기
        int[] score = new int[5];

        getNumbers("점수 >> ", score);//call by reference

        showNumbers(score);
        System.out.println();
        System.out.println("점수 총합 : " + addAll(score));
        double avg = (double) addAll(score) / score.length;
        System.out.println("점수 평균은 " + avg);
    }
}
