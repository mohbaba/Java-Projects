package TicTacToe;

public class Player {
    private final int id ;
    public boolean isFirstPlayer;
    public Player(int id,boolean isFirstPlayer) {
        this.id = id;
        this.isFirstPlayer = isFirstPlayer;
    }

    public int getId() {
        return id;
    }

    public void play(int position, TicTacToe game){
        game.markBoard(position,getId());
    }
}
