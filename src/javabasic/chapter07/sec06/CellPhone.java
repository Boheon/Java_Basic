package javabasic.chapter07.sec06;

public class CellPhone {//부모
    String model;
    String color;

    public CellPhone() {
    }

    public CellPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }


    void receiveVoice(String message){
        System.out.println("상대방 : "+ message);
    }

    void powerOn(){
        System.out.println("전원을 켭니다");
    }

    void powerOff(){
        System.out.println("전화를 끕니다");
    }

    void hangUp(){
        System.out.println("통화를 끊습니다");
    }
}
