package javabasic.chapter09.sec01;

public class Audio implements RemoteControl{

    private int volume;
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("현재 소리 : "+volume);
    }
}
