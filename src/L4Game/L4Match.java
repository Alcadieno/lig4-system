package L4Game;

import BoardGame.Board;
import BoardGame.Piece;
import BoardGame.Position;
import L4Game.Pieces.Red;
import L4Game.Pieces.Blue;
import app.UI;


public class L4Match {
    private Board board;

    public L4Match() {
        board = new Board(6, 7);
        initialSetup();

        }



    public L4Piece[][] getPieces() {
        L4Piece[][] matriz = new L4Piece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matriz[i][j] = (L4Piece) board.piece(new Position(i, j));
            }
        }
        return matriz;
    }

    private void placenewPiece(char column, int row, L4Piece piece) {

        board.placePiece(piece, new L4Position(column, row).toposition());
    }

    private void initialSetup() {
        placenewPiece('c', 6, new Blue(board, color.blue));
        placenewPiece('c', 5, new Red(board, color.red));
        placenewPiece('g', 6, new Red(board, color.red));
        placenewPiece('g', 5, new Red(board, color.red));
        placenewPiece('g', 4, new Red(board, color.red));
        placenewPiece('f', 6, new Red(board, color.red));
        placenewPiece('a', 6, new Red(board, color.red));
        placenewPiece('a', 5, new Blue(board, color.blue));
        placenewPiece('a', 4, new Red(board, color.blue));
        placenewPiece('a', 3, new Blue(board, color.blue));
        placenewPiece('b', 6, new Red(board, color.red));
        placenewPiece('b', 5, new Blue(board, color.blue));
        placenewPiece('b', 4, new Red(board, color.red));
        placenewPiece('a', 3, new Red(board, color.red));
        placenewPiece('d', 6, new Red(board, color.blue));
        placenewPiece('g', 3, new Blue(board, color.red));
        placenewPiece('g', 2, new Blue(board, color.blue));



    }

    public static boolean winMatch(L4Piece[][] matriz) {
        int rows = matriz.length;
        int columns = matriz[0].length;

        // Verificar vitoria vertical
        for (int coluna = 0; coluna < columns; coluna++) {
            for (int linha = 0; linha < rows - 3; linha++) {
                L4Piece currentPiece = matriz[linha][coluna];
                if (currentPiece != null &&
                        currentPiece.isSameColor(matriz[linha + 1][coluna]) &&
                        currentPiece.isSameColor(matriz[linha + 2][coluna]) &&
                        currentPiece.isSameColor(matriz[linha + 3][coluna])) {
                    return true;
                }
            }
        }

        // Verificar correspondência nas diagonais superiores
        for (int linha = 0; linha < rows - 3; linha++) {
            for (int coluna = 0; coluna < columns - 3; coluna++) {
                L4Piece currentPiece = matriz[linha][coluna];
                if (currentPiece != null &&
                        currentPiece.isSameColor(matriz[linha + 1][coluna + 1]) &&
                        currentPiece.isSameColor(matriz[linha + 2][coluna + 2]) &&
                        currentPiece.isSameColor(matriz[linha + 3][coluna + 3])) {
                    return true;
                }
            }
        }

        // Verificar correspondência horizontal
        for (int linha = 0; linha < rows; linha++) {
            for (int coluna = 0; coluna < columns - 3; coluna++) {
                L4Piece currentPiece = matriz[linha][coluna];
                if (currentPiece != null &&
                        currentPiece.isSameColor(matriz[linha][coluna + 1]) &&
                        currentPiece.isSameColor(matriz[linha][coluna + 2]) &&
                        currentPiece.isSameColor(matriz[linha][coluna + 3])) {
                    return true;
                }
            }
        }

        // Verificar correspondência nas diagonais inferiores
        for (int linha = 3; linha < rows; linha++) {
            for (int coluna = 0; coluna < columns - 3; coluna++) {
                L4Piece currentPiece = matriz[linha][coluna];
                if (currentPiece != null &&
                        currentPiece.isSameColor(matriz[linha - 1][coluna + 1]) &&
                        currentPiece.isSameColor(matriz[linha - 2][coluna + 2]) &&
                        currentPiece.isSameColor(matriz[linha - 3][coluna + 3])) {
                    return true;
                }
            }
        }

        return false;
    }

}