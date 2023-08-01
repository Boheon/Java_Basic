package javabasic.chapter05;

public class ArrayEx1 {
    public static void main(String[] args) {
//        int age;
//        System.out.println(age);

        double[] height = {123.4, 234.2, 124.5};
        double[] space = new double[500];//0으로 초기화 primitive
        char[] gender = {'남', '여', '남'};
        String[] space2 = new String[333];//0으로 초기화 reference

        System.out.println(height);
        System.out.println(height[0]);

        System.out.println(space);
        System.out.println(space[0]);
        System.out.println(space[101]);

        System.out.println(space2);//참조값 데이터의 시작주소
        System.out.println(space2[0]);//null 0으로 초기화 되었으나 참조형이라 null


    }
}
