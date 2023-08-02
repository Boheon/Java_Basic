package javabasic.chapter05;

public class ArrayEx2 {

    public static void main(String[] args) {

        //배열은 자동 초기화
//        String[] names = new String[1000];
//
//        System.out.println(names[0]);
//        System.out.println(names.length);
//        System.out.println(names[names.length-1]);


        int[] score = new int[1000];

        System.out.println(score);

        score[0]=100;
        score[10]=200;
        score[999]=1000;

        System.out.println("첫번째 값: "+score[0]);
        System.out.println("11번째 값: "+score[10]);
        System.out.println("마지막 값: "+score[999]);
        System.out.println("500번째 값: "+score[499]);
        for(int i = 0; i < score.length; i++){
            System.out.println(i+" : "+score[i]);
        }
        
        int sum = 0;
        for(int value : score){//값기반
            System.out.println(value);
            sum += value;
        }

    }
}
