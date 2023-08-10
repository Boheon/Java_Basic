package javabasic.chapter11.objectClass;

import javabasic.chapter11.objectClass.Member;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue",12);
        Member obj2 = new Member("blue", 22);
        Member obj3 = new Member("red", 32);
        String obj4 = new String("blue");

        if(obj1.equals(obj2)){
            System.out.println("obj1은 obj2와 동일합니다.");
        }else{
            System.out.println("obj1과 obj2는 동일하지 않습니다.");
        }

        if(obj1.equals(obj3)){
            System.out.println("obj1과 obj3는 동등합니다.");
        }else{
            System.out.println("obj1과 obj3는 동등하지 않습니다.");
        }
        System.out.println(obj1.equals(obj4));//String도 object라 넘길수있다. 모든 클래스를 넘길수있다
    }
}

