package L4Game;

import BoardGame.Board;
import BoardGame.Position;
import L4Game.Pieces.Red;
import L4Game.Pieces.Blue;

public class L4Match {
    private Board board;

    public  L4Match(){
        board = new Board(6,7);
        initialSetup();

    }
    public L4Piece [][] getPieces(){
        L4Piece[][]matriz = new L4Piece[board.getRows()][board.getColumns()];
        for(int i = 0 ; i < board.getRows(); i++){
            for(int j = 0 ; j < board.getColumns();j++){
                matriz[i][j] = (L4Piece) board.piece(new Position(i,j));
            }
        }
        return  matriz;
    }
    private void placenewPiece( char column, int row , L4Piece piece){

        board.placePiece(piece,new L4Position(column,row).toposition());
    }
    private void initialSetup(){
        placenewPiece('c',6,new Red(board,color.RED));
        placenewPiece('c',5,new Red(board,color.RED));
        placenewPiece('c',4,new Red(board,color.RED));
        placenewPiece('g',6,new Red(board,color.RED));
        placenewPiece('g',5,new Red(board,color.RED));
        placenewPiece('g',3,new Red(board,color.RED));



    }
}
