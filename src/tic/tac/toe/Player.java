package tic.tac.toe;

public class Player {
    private String name;

    private PlayingPiece playingPiece;

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }


    Player(String name , PlayingPiece playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
    }
}
