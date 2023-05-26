package BoardGame;
import java.util.Stack;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("ERROR CREATING BOARD");
        }

        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("POSITION NOT ON THE BOARD!!");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("POSITION NOT ON THE BOARD!!");
        }
        return pieces[position.getRow()][position.getColum()];
    }

    public boolean isEmpty() {
        for (Piece[] row : pieces) {
            for (Piece piece : row) {
                if (piece != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isFull() {
        for (Piece[] row : pieces) {
            for (Piece piece : row) {
                if (piece == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void placePiece(Piece piece, Position position) { // ISSO È UM METOO QUE IMPLEMENTA UMA PILHA EM UMA MATRIZ 6x7
        if (!positionExists(position)) {
            throw new BoardException("POSITION NOT ON THE BOARD!!");
        }

        int row = position.getRow();
        int column = position.getColum();

        if (row > 0 && pieces[row - 1][column] == null) { // ISSO VERIFICA SE EXISTE UMA PEÇA ABAIXO , PARA QUE SEJA POSSIVEL EMPILHAR
            throw new BoardException("NÃO É POSSÍVEL ADICIONAR UM ITEM NESSA POSIÇÃO, POIS NÃO HÁ UM ITEM ABAIXO");
        }

        pieces[row][column] = piece;
        piece.setPosition(position);
    }

    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColum());
    }

    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("POSITION NOT ON THE BOARD!!");
        }
        return piece(position) != null;
    }
}