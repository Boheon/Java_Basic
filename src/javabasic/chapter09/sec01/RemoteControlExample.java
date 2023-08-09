package javabasic.chapter09.sec01;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc = new Audio();
        //해당 인터페이스를 통해 구현되면 다 참조가능
    }
}
