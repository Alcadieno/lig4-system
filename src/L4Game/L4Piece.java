package L4Game;
import BoardGame.Piece;
import BoardGame.Board;
import L4Game.Pieces.Blue;
import L4Game.Pieces.Red;


public class L4Piece extends Piece {
    private color color;

    public L4Piece(Board board,color color) {
        super(board);
        this.color = color;

    }
    public L4Game.color getColor(){

        return color;
    }
    public boolean isSameColor(L4Piece otherPiece) {
        if (otherPiece == null) {
            return false;
        }
        return this.color == otherPiece.color;
    }
}
