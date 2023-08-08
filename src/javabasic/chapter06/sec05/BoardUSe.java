package javabasic.chapter06.sec05;

public class BoardUSe {
    public static void main(String[] args) {
        Board board1 = new Board(1, "java", "blabla", "pbh");
        Board board2 = new Board(1, "jsp", "funfun", "soo");
        Board board3 = new Board(1, "spring", "hihihi", "min");

        Board[] boards = {board1, board2, board3};

        System.out.printf("%-9s %-9s %-9s %-9s\n", "no", "title", "content", "writer");
        for (Board board : boards) {
            System.out.printf("%-9d %-9s %-9s %-9s", board.getNo(), board.getTitle(), board.getContent(), board.getWriter());
            System.out.println();
        }
    }
}
