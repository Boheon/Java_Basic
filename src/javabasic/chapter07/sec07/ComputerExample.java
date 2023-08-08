package javabasic.chapter07.sec07;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : "+ calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();

        //오버라이드된 메소드 사용
        System.out.println("원면적 : "+ computer.areaCircle(r));

        System.out.println(calculator); //calculator.toString()호출 => OBJECT클래스의 toString 사용
        System.out.println(computer);//computer.toString() 호출
    }
}
