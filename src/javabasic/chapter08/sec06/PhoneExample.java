package javabasic.chapter08.sec06;

public class PhoneExample {
    public static void main(String[] args) {

        //Phone phone1 = new Phone(); // 추상클래스라 오류나야 정상
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();;
        smartPhone.internetSearch();
        smartPhone.turnOff();

        Phone phone = new SmartPhone("홍길동");

        phone.turnOn();
        ((SmartPhone) phone).internetSearch();
        phone.turnOff();
    }
}
