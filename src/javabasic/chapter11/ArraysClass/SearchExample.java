package javabasic.chapter11.ArraysClass;

import java.util.Arrays;

public class SearchExample {
    public static void main(String[] args) {
        Member[] members = {
                new Member("홍길동",23),
                new Member("김민수",14),
                new Member("박동수",72)
        };
        Arrays.sort(members);
        int index = Arrays.binarySearch(members, new Member("홍길동", 23));
        System.out.println(Arrays.toString(members));
        System.out.println("찾은 인덱스 : "+index);
    }
}
