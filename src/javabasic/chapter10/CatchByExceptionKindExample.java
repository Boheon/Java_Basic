package javabasic.chapter10;

public class CatchByExceptionKindExample {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);
//        System.out.println(args[0]);//outofbound
//        System.out.println(args[1]);
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            System.out.println(value1+value2);
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("실행 매개 값의 수가 부족합니다.");//err로 하면 finally 다음에 출력될수도있다. 버퍼링에 따라 다름

        }catch (NumberFormatException e){
            System.err.println(e);
        }finally{
            System.out.println("다시 실행하세요.");//out과 err이 버퍼가 다르기 때문에 뭐가 먼저 나올지 모른다.
        }
    }
}
