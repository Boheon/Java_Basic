package javabasic.chapter07.sec02;

public class AccountUse {
    public static void main(String[] args) {
        Account a1 = new Account("hgd", "2323", 1200);
        Account a2 = new Account("ggd", "1212", 1500);

//        Account a4 = new Account();//생성자를 정의하여 에러

        System.out.println(a1);
        System.out.println(a1.toString());
        System.out.println(a2);
        System.out.println(a2.toString());
    }
}
