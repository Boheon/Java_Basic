package javabasic.chapter03;

public class StringCompare {
    public static void main(String[] args) {
//        String str1 = "안녕하세요."; 안녕하세요를 힙에 넣고 str1, str2 모두 해당 주소를 가르킨다
//        String str2 = "안녕하세요.";

        String str1 = new String("안녕하세요.");//new는 새로운 객체를 만드므로 str1과 str2는 다른 주소값을 가진다.
        String str2 = new String("안녕하세요.");

        System.out.println(str1);
        System.out.println(str2);


        //js == --> 내용검사
        //java == --> 참조값검사
        //java equals() --> 내용검사
        if(str1.equals(str2)){
            System.out.println("두 문자열 동등");
        }
        else{
            System.out.println("두 문자열 다름");
        }
    }
}
