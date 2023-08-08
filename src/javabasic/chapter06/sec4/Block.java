package javabasic.chapter06.sec4;

public class Block {
    int x = 10;
    int y = 20;
    String color = null;

    public void put() {
        int move = 50;
        System.out.println(move + "만큼 벽돌을 쌓다.");
    }

    @Override
    public String toString() {
        return "Block[x=" + x + ", y=" + y + ", color=" + color + "]";
    }
}
