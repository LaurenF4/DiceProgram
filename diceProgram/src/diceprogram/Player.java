package diceprogram;


/**
 * Author: Lauren F
 * Date: 26/10
 */
//Creating the Player
public class Player {
    
    private String playerName;
    private boolean hasWon;
    private Dice playerDice;
    
    Player(){
        playerName = "";
        hasWon = false;
        playerDice = new Dice();
    }
    
    //Getters and Setters
        public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    public Dice getPlayerDice() {
        return playerDice;
    }
}
