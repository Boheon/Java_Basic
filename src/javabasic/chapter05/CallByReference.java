package javabasic.chapter05;

public class CallByReference {
    public static void main(String[] args) {
        int[] data = {100,200,300};

        System.out.printf("%d% %d\n",data[0], data[1]);
    }

    static void swap(int[] data){
        int temp;
        temp = data[0];
        data[0] = data[1];
        data[1] =temp;

        System.out.printf("%d %d\n",data[0],data[1]);
    }
}
