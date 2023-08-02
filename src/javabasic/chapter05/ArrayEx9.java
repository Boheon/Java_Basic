package javabasic.chapter05;


import static javabasic.chapter05.ArrayUtil.*;

public class ArrayEx9 {



    public static void main(String[] args) {
        int[] nums = new int[5];
        getNumbers("숫자 >> ", nums);

        int max = findMaxValue(nums);
        int min = findMinValue(nums);


        System.out.println("최대값은 " + nums[max] + "\n최소값은 " + nums[min]);
    }


}
