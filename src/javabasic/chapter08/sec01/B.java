package javabasic.chapter08.sec01;

public class B extends A{
    @Override//같은 패키지라 접근가능
    public void method(){
        A a = new A();
        a.field = "value";
        a.method();
    }
}
