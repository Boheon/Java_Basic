package javabasic.chapter05;

import java.util.Random;

import static javabasic.chapter05.ArrayUtil.findMinValue;
import static javabasic.chapter05.ArrayUtil.getNumbers;

public class ArrayEx10 {

    //배열 입력을 받아 구성
    //최소값을 찾아 인덱스 0 과 위치 바꿈
    static int[] ascendingSort(int[] data){

        int minIx = findMinValue(data);
        int temp = data[0];
        data[0] = data[minIx];
        data[minIx] = temp;

        return data;
    }
    public static void main(String[] args) {
        int[] data = new int[5];

        //데이터입력
        getNumbers("숫자 입력>>> ", data);
        System.out.println(ascendingSort(data)[0]);
    }
}
