package L4Game;
import BoardGame.Position;

public class L4Position {
    private char column;
    private int row;


    public L4Position(char column, int row) {
        this.column = column;
        this.row = row;

    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
    protected Position toposition(){
        return new Position(6 - row,column -'a');
    }
    protected static L4Position fromPosition (Position position){
        return new L4Position((char)('a'- position.getColum()),6- position.getRow());

    }
    @Override
    public String toString(){
        return ""+ column + row;
    }


}
