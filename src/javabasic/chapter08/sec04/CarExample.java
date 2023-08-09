package javabasic.chapter08.sec04;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for(int i = 0; i <=5; i++){
            int problemLocation = car.run();
            switch(problemLocation){
                case 1: //앞왼쪽 타이어 펑크시 HanKookTire로 교체
                    System.out.println("앞 왼쪽 Hankook Tire로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;

                case 2: //앞 오른쪽 타이어 펑크시 KumohTire로 교체
                    System.out.println("앞 오른쪽 Hankook Tire로 교체");
                    car.frontRightTire = new KumohTire("앞오른쪽", 13);
                    break;

                case 3: //뒷왼쪽 타이어 펑크시 HanKookTire로 교체
                    System.out.println("뒤 왼쪽 Hankook Tire로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;

                case 4: //뒤오른쪽 타이어 펑크시 KumohTire로 교체
                    System.out.println("뒤 오른쪽 Hankook Tire로 교체");
                    car.backRightTire = new KumohTire("뒤왼쪽", 17);
                    break;
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
