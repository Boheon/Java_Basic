package javabasic.chapter11.hashCode;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        //Key 객체를 식별키로 사용해서 String 값을 저장함
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        //식별키 (Key(1)으로 홍길동 저장
        hashMap.put(new Key(1), "홍길동");

        // new Key(1)으로 홍길동 불러오기
        String value = hashMap.get(new Key(1));
        System.out.println(value);//찾을수 없다

        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.hashCode());
    }
}
