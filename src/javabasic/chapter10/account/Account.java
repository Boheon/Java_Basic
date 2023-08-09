package javabasic.chapter10.account;

public class Account {
    private long balance;
    
    public Account(){}

    public long getBalance() {
        return balance;
    }
    
    public void deposit(int money){
        balance += money;
    }
    
    public void withdraw(int money) throws BalanceInsufficientException {
        if(balance < money){
            throw new BalanceInsufficientException("잔고 부족 : "+ (money - balance)+"원 모자람");
        }
        balance -= money;//예외가 발생해서 throw되면 여기까지 안내려옴
    }
}
