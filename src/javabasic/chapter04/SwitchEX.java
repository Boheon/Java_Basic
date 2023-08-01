package javabasic.chapter04;

public class SwitchEX {
    public static void main(String[] args) {
        String name = "java";

        switch(name){
            case "java":
                System.out.println("1103호로 가세요");
                break;

            case "python":
                System.out.println("1104호로 가세요");
                break;

            case "linux":
                System.out.println("1105호로 가세요");
                break;

            default:
                System.out.println("카운터에 가서 문의하세요.");
                break;
        }
    }
}
