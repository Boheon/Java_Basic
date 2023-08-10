package javabasic.chapter11.ArraysClass;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        //primitive
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        //reference
        String[] names = {"홍길동", "박동수", "김민수"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //user Class
        Member[] members = {
                new Member("홍길동",23),
                new Member("김민수",14),
                new Member("박동수",72)
        };
        Arrays.sort(members);
        System.out.println(Arrays.toString(members));//object의 tostring 출력
    }
}
