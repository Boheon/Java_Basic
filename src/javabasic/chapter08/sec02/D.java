package javabasic.chapter08.sec02;

import javabasic.chapter08.sec01.A;

public class D extends A {
    public D(){
        super();//상속하니 C와 달리 접근가능하다
        this.field = "value";
        this.method();
    }
}
