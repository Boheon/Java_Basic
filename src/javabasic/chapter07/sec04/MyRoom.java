package javabasic.chapter07.sec04;

import org.w3c.dom.ls.LSOutput;

public class MyRoom {
    public static void main(String[] args) {
        Tv myTv1 = new Tv(7, 9, true);
        Tv myTv2 = new Tv(8, 10, false);

        System.out.println(myTv1);
        System.out.println(myTv2);
        Tv[] tvArr = new Tv[100];
        for (int i = 0; i < 100; i++) {
            Tv tv = new Tv(1, 1, true);
            tvArr[i] = tv;
            //tvArr = new Tv(1, 1, true)
        }
        System.out.println(myTv1.getChannel());
        System.out.println(myTv2.getChannel());
        System.out.println(tvArr[0]);

        Tv[] tvArrs = {
                new Tv(100, 100, false),
                new Tv(100, 200, true),
                new Tv(200, 100, false),
        };

        System.out.println(Tv.count);
    }


}
