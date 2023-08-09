package javabasic.chapter09.sec01;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 10;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default  void setMute(boolean mute){
        if(mute){
            System.out.println("음소거합니다.");
        }else{
            System.out.println("음소거 해제합니다.");
        }
    }

    //정적메소드
    static void changeBattery(){
        System.out.println("건전지를 교환합니다.");
    }
}
