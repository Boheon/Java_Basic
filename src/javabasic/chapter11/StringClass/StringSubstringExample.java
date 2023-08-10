package javabasic.chapter11.StringClass;

public class StringSubstringExample {
    public static void main(String[] args) {
        String ssn = "880343-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);

        String fileName = "Hello.World.mp3";
        int ix = fileName.lastIndexOf(".");
        if (ix != -1) {//없을경우제외
            String ext = fileName.substring(ix + 1);
            System.out.println(ext);
            String ext2 = fileName.substring(0,ix);
            System.out.println(ext2);
        }
    }
}
