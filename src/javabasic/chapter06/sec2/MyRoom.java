package javabasic.chapter06.sec2;

import javabasic.chapter06.sec1.Phone;

public class MyRoom {
    public static void main(String[] args) {
        TV myTV = new TV();
        myTV.ch = 50;
        myTV.vol= 100;
        myTV.onOff = true;
        System.out.println(myTV);


        TV yourTV = new TV();
        yourTV.ch = 50;
        yourTV.vol= 100;
        yourTV.onOff = true;
        System.out.println(yourTV);



    }
}
