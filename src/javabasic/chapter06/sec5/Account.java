package javabasic.chapter06.sec5;

public class Account {
    String name;
    String accountName;
    int balance;
    public void deposit(int amount){
        balance += amount;
        System.out.printf("%s이 %d원을 입금하다.",name, balance);
    }

    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("잔액이 부족합니다");
        }else {
            balance -= amount;
            System.out.printf("%s이 %s에서 출금하다.", name, accountName);
        }
    }
}
