package javabasic.chapter02;

public class BasicData02 {
    public static void main(String[] args) {
        //정수=>int
        byte age = 100;//-128~127
        short wallet = 20000; //-3만~3만
        int money = 500000; //-21억~21억
        long space =1000000000000L;//21억이상

        System.out.println("내 은행에 든 돈 : "+money+"원");

        //실수 => double
        double height = 185.5;
        float weight = 88.8f;
        System.out.println("내 키는 : "+height);

        //문자 -> 한 글자
        char gender = '남';//글자없으면 에러
        System.out.println("내 성별은 "+gender);

        //기본 데이터는 아니나
        //일상 생활에서 문자들을 더 많이 사용하므로,
        //이 부품을 기본 데이터로 쓸 수 있게 만듦
        //char + char+ char+...
        String name = "홍길동";
        System.out.println("내 이름은: "+name);
    }



}
