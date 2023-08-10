package javabasic.chapter11.clone;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("blue", "홍길동", "12345", 23, true);

        //복제객체를 얻은 후에 패스워드 변경
        Member cloned = original.getMember();
        cloned.password = "67890";//원본은 변경되지 않는다.

        System.out.println("복제객체의 필드 값");
        System.out.println(cloned);

        System.out.println("원본 객체의 필드 값");
        System.out.println(original);
    }
    //원본객체 생성



}
