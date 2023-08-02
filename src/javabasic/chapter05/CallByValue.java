package javabasic.chapter05;

public class CallByValue {
    public static void main(String[] args) {
        int x = 100;
         int y  =200;

         swap(x,y);

        System.out.printf("x : %d, y : %d",x,y);
    }

    static void swap(int x, int y){
        int temp;
         temp = x;
         x=y;
         y=temp;
        System.out.printf("x : %d, y : %d",x,y);
    }
}
