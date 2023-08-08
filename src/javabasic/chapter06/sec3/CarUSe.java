package javabasic.chapter06.sec3;

import javabasic.chapter06.sec3.Car;

public class CarUSe {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "black";
        System.out.println(car1.color);
        car1.run();
        car1.up();

        Car car2 = new Car();
        car2.color = "red";
        System.out.println(car2.color);
        car2.run();
        car2.up();
    }
}
