package tic.tac.toe;

import java.util.ArrayDeque;
import java.util.Deque;

public class TicTacToe {

    Deque<Player> players;
    Board gameBoard;

    TicTacToe(){
        this.players = new ArrayDeque<Player>();
    }

    public void gameInitialize() {
        PlayingPiece crossPiece = new PieceX();
        Player player1 = new Player("Vishal", crossPiece);
        PlayingPiece circlePiece = new PieceO();
        Player player2 = new Player("Pulkit", circlePiece);
        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);

    }

    public void startGame() {
        boolean noWinner = true;
        while (noWinner) {

            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();
            noWinner = false;
        }
    }
}
