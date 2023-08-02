package javabasic.chapter05;

public class ArrayEx5 {
    public static void main(String[] args) {
        String[] names = {"홍길동", "김길동", "박길동", "송길동", "정길동"};
        int[] ages = {50, 40, 30, 20, 10};
        int[] shoes = {134, 235, 245, 255, 300};
        char[] gender = {'남', '여', '남', '남', '여'};

        for(int i = 0; i < names.length; i++){
            System.out.print(names[i]+" "+ages[i]+" "+shoes[i]+" "+gender[i]);
            System.out.println();
        }


    }

}
