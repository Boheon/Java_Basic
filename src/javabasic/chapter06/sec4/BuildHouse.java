package javabasic.chapter06.sec4;

public class BuildHouse {
    public static void main(String[] args) {
        Block block1 = new Block();
        block1.x = 50;
        block1.y = 50;
        block1.color = "회색";
        System.out.println(block1);

        Block block2 = new Block();
        block2.x = 150;
        block2.y = 150;
        block2.color = "파란색";
        System.out.println(block2);

        block1.put();
        block2.put();
    }
}
