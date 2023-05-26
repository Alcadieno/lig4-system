package L4Game;
import BoardGame.Piece;
import BoardGame.Board;

public class L4Piece extends Piece {
    private color color;

    public L4Piece(Board board,L4Game.color color) {
        super(board);
        this.color = color;

    }
    public L4Game.color getColor(){
        return color;
    }
}
