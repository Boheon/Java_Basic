package javabasic.chapter11.ArraysClass;

public class Member implements Comparable<Member>{
    String name;
    int age;

    public Member(String name, int age)  {
        super();
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Member o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
