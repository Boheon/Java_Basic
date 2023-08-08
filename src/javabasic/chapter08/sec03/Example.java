package javabasic.chapter08.sec03;

public class Example {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;//자동 타입변환

        parent.method1();
        parent.method2();//오버라이딩된 메소드 호출
        //parent.method3();//호출 불가능 타입이 Parent이기 때문

        child.method1();
        child.method2();
        child.method3();

    }

}
