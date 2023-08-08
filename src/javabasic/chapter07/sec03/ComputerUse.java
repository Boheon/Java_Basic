package javabasic.chapter07.sec03;

public class ComputerUse {
    public static void main(String[] args) {
        Computer com1 = new Computer(250000, "Apple", 19);
        Computer com2 = new Computer(200000, "Banana", 14);

        System.out.println(com1);
        System.out.println(com2);

        Computer com3 = new Computer();
        com3.setPrice(150000);
        com3.setMonitor(17);
        com3.setMaker("MS");
    }
}
