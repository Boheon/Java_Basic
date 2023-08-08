package javabasic.chapter05;

import java.util.Random;

import static javabasic.chapter05.ArrayUtil.getRandomArray;

public class ArrayEx11 {
    public static void main(String[] args) {
//        int[] score = new int[10000];
//        Random ran = new Random(5);
//        for(int i = 0; i < score.length; i++){
//            score[i] = ran.nextInt(331);//0-330
//        }

        int[] score = getRandomArray(10000, 331);

        int count = 0;
        for(int i = 0; i < score.length; i++){
            if(score[i]==330){
                count++;
                System.out.println(count + " : 만점자 번호는 "+i+"번");
            }
        }
        System.out.println("전체 만점자 수는 "+count+"명");
    }

}
