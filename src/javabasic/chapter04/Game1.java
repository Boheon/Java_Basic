package javabasic.chapter04;


import java.util.Random;
import java.util.Scanner;

//가위바위보
public class Game1 {
    public static void main(String[] args) {

        final int SCISSORS = 0;
        final int ROCK = 1;
        final int PAPER = 2;

        int playerWin = 0;
        int computerWin = 0;
        int draw = 0;

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int computer = rand.nextInt(3);//3은 미포함 0, 1, 2

            System.out.print("무엇을 내시겠습니까? 0-가위, 1-바위, 2-보 -1-종료 >>");
            int player = sc.nextInt();

            System.out.printf("컴퓨터 : %d, 나 : %d \n", computer, player);

            if (player == computer) {
                //비긴경우
                System.out.println("비겼습니다.");
                draw++;
            } else if (player == SCISSORS && computer == PAPER ||
                    player == ROCK && computer == SCISSORS ||
                    player == PAPER && computer == ROCK) {
                //이긴경우
                System.out.println("이겼습니다");
                playerWin++;
            } else if (player == -1) {
                System.out.println("종료합니다.");
                System.out.println("플레이어 승리 횟수 : " + playerWin);
                System.out.println("컴퓨터 승리 횟수 : " + computerWin);
                System.out.println("비긴 횟수 : " + draw);
                int sum = playerWin+computerWin;
                double result = (double) playerWin/sum * 100;
                System.out.printf("나의 승률 %d%%", (int) result);
                break;
            } else {
                //진경우
                System.out.println("졌습니다.");
                computerWin++;

            }
        }
    }
}
