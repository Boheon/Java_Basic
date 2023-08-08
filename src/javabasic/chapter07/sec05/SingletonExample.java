package javabasic.chapter07.sec05;

import javabasic.chapter07.sec05.Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton si1 = Singleton.getInstance();
        Singleton si2 = Singleton.getInstance();

        if(si1 == si2){
            System.out.println("같다");
        }else {
            System.out.println("다르다");
        }

        si1.open();
        si2.close();
        si1.read();
    }
}
