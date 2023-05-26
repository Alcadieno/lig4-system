package app;

import L4Game.L4Match;

public class Program {
    public static void main(String[] args) {
        L4Match match1 = new L4Match();
        UI.printBoard(match1.getPieces());
        if (L4Match.winMatch(match1.getPieces())){

            System.out.println(" ");

            System.out.println("PARABÉNS!!!! VOCÊ VENCEU O JOGO");
        }
    }
}
