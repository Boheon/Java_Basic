package javabasic.chapter07.sec04;

public class Tv {
    private int channel;
    private int volume;
    private boolean onOff;

    private final int serial;
    static final double PI = 3.14;

    static int count = 0;//static 변수는 초기값을 명시적으로 주는 게 좋다.

    public Tv(int channel, int volume, boolean onOff) {
        super();
        count++;
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
        this.serial = count;
    }

    public Tv() {
        super();
        count++;
        serial = count;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", onOff=" + onOff +
                '}';
    }

}
