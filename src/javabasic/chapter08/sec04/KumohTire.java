package javabasic.chapter08.sec04;

public class KumohTire extends Tire{

    public KumohTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " KumohTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("***" + location + " KumohTire 펑크 ***");
            return false;
        }
    }
}
