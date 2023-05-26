package app;
import L4Game.L4Piece;
public class UI {
    public static void printBoard(L4Piece[][] pieces){
        for(int i = 0 ; i < pieces.length;i++){ // For para linhas
            System.out.print((6-i)+ " ");
            for(int j = 0 ; j< pieces[i].length;j++){ // For para colunas
                printPiece(pieces[i][j]);
            }
            System.out.println("");
        }
        System.out.print (" a b c d e f g");
    }
    private  static  void printPiece (L4Piece piece){
        if(piece == null){ // verifica se existe peça , se nao imprime "-"
            System.out.print("-");

        }else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
