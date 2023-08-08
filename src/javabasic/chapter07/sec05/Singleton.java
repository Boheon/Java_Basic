package javabasic.chapter07.sec05;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private String dbname = "pbh database";
    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }

    public void open(){
        System.out.println(dbname+"열기");
    }

    public void close(){
        System.out.println(dbname+"닫기");
    }

    public void read(){
        System.out.println(dbname+"읽기");
    }
}
