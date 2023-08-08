package javabasic.chapter05;

import java.util.Random;

import static javabasic.chapter05.ArrayUtil.*;

public class ArrayEx10 {


    public static void main(String[] args) {
//        int[] data = new int[5];
//
//
//       //데이터입력
//        getNumbers("숫자 입력>>> ", data);
        //배열 입력을 받아 구성

        //랜덤한 수열 만들기
        int[] data = getRandomArray(5, 51);

        //최소값을 찾아 인덱스 0 과 위치 바꿈
        for (int i = 0; i < data.length; i++) {
            int minIx = findMinValue(data, i, data.length);
            //i위치와 minix위치를 교환
            swapArray(data, i, minIx);
        }
        showNumbers(data);
    }
}
