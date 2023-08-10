package javabasic.chapter13.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        System.out.println(list);

        int size = list.size();
        System.out.println("총 객체수 : "+size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2 : "+skill);
        System.out.println();
    }
}
