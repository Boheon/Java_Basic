package javabasic.chapter07.sec01;

public class AccountUse {
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1);

        Account a2 = new Account("hgd", "일반예금", 10000);
        System.out.println(a2);
    }


}
