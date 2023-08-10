package javabasic.chapter12.sec01;

public class Util {
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
}
