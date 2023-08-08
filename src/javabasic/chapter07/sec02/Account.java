package javabasic.chapter07.sec02;

public class Account {
    private String name;
    private String ssn;
    private int money;

    public Account(){
        //super();
    }
    public Account(String name, String ssn, int money){
        this.name = name;
        this.ssn = ssn;
        this.money = money;
    }

    public Account(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString(){
        return "Account[name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
    }
}
