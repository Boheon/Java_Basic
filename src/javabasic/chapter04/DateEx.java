package javabasic.chapter04;

import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date date = new Date(); // 호출 당시의 날짜 시간 세팅
        int hour = date.getHours();
        int min = date.getMinutes();
        int sec = date.getSeconds();
        //System.out.println(hour+"시 "+min+"분 "+sec+"초");
        System.out.printf("%d시 %d분 %d초\n",hour, min, sec);

        int year = date.getYear();
        int month = date.getMonth()+1;//월은 0부터 시작
        int today = date.getDate();
        int day = date.getDay();//요일 0~6
        System.out.printf("%d년 %d월 %d일\n",year+1900, month, today);

        System.out.printf("%4d-%02d-%02d %02d:%02d:%02d\n", year+1900, month, today, hour, min, sec);

        switch (today){
            case 0: case 6:
                System.out.println("자바 공부하러 가");
                break;
//            default:
//                break;
        }

        switch (month){
            case 3: case 4: case 5:
                System.out.println("봄");
                break;

            case 6: case 7: case 8:
                System.out.println("여름");
                break;

            case 9: case 10: case 11:
                System.out.println("가을");
                break;

            default:
                System.out.println("겨울");
                break;
        }
    }
}
