package javabasic.chapter05;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {
    public static void getNumbers(String word, int[] data) {
        Scanner scan = new Scanner(System.in);
        System.out.printf(word);
        for (int i = 0; i < data.length; i++) {

            data[i] = scan.nextInt();//버퍼링 --> 엔더 앞에 데이터 여러개 줄 수 있다
        }
    }

    static void showNumbers(int[] data) {
        for (int point : data) {
            System.out.print(point + " ");
        }
    }

    static int addAll(int[] data) {
        int sum = 0;
        for (int point : data) {
            sum += point;
        }
        return sum;
    }

    static int findMaxValue(int[] data) {
        int max = data[0];
        int maxIndex = 0;
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int findMinValue(int[] data, int start, int end) {
        int min = data[start];
        int minIndex = start;
        for (int i = start; i < end; i++) {

            if (min > data[i]) {
                min = data[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    static void swapArray(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    static int[] getRandomArray(int length, int util) {
        int[] data = new int[length];
        Random ran = new Random(5);
        for (int i = 0; i < data.length; i++) {
            data[i] = ran.nextInt(util);//0-330
        }
        return data;//데이터가 아니라 주소값이 전달
//        return null; // null pointer exception
    }
}
