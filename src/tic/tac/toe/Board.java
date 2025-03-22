package tic.tac.toe;

public class Board {
    private int size;
    private PlayingPiece[][] board;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getPieceType() + " ");
                } else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

//    public List<Pair<Integer, Integer>> getFreeCells(){
//
//    }
}
