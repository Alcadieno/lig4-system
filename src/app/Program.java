package app;

import L4Game.L4Match;

public class Program {
    public static void main(String[] args) {
        L4Match match1 = new L4Match();
        UI.printBoard(match1.getPieces());
    }
}
