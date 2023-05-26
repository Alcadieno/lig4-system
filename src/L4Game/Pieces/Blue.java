package L4Game.Pieces;
import BoardGame.Board;
import L4Game.L4Piece;
import L4Game.color;

public class Blue extends L4Piece{
    public Blue (Board board , L4Game.color color){
        super(board,color);

    }
    @Override
    public String toString(){
        return "B";
    }
}
