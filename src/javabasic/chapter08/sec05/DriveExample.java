package javabasic.chapter08.sec05;

public class DriveExample {
    //SOLID 중 OCP
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);//Dependency Injection => 결합도를 낮출수 있다.
        driver.drive(taxi);//Dependency Injection
    }
}
