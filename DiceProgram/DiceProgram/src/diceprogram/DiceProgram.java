package diceprogram;
/**
* Author: Lauren
* Date: 31/10/23
**/

public class DiceProgram {

    public static void main(String[] args) {
        
        Dice.setNumberOfFaces(6);
        
        Player[] thePlayers = new Player[2];
        
        for (int i = 0; i < thePlayers.length; i++) {
            thePlayers[i] = new Player();
        }
            
        thePlayers[0].setPlayerName("Lauren");
        thePlayers[1].setPlayerName("Lauren II");
        
        int counter = 0;
        do{
            System.out.println(thePlayers[0].getPlayerName() + " rolled a " + thePlayers[0].getPlayerDice(0).rollDice() + " and a " + thePlayers[0].getPlayerDice(1).rollDice());
            System.out.println(thePlayers[1].getPlayerName() + " rolled a " + thePlayers[1].getPlayerDice(0).rollDice() + " and a " + thePlayers[1].getPlayerDice(1).rollDice());
            if (thePlayers[0].getPlayerDice(0).getCurrentShownFace() == thePlayers[0].getPlayerDice(1).getCurrentShownFace()){
                thePlayers[0].setHasWon(true);
            } 
            
            if (thePlayers[1].getPlayerDice(0).getCurrentShownFace() == thePlayers[1].getPlayerDice(1).getCurrentShownFace()){
                thePlayers[1].setHasWon(true);
            }
            counter ++;
        } while ((thePlayers[0].getPlayerDice(0).getCurrentShownFace() != thePlayers[0].getPlayerDice(1).getCurrentShownFace()) 
                && (thePlayers[1].getPlayerDice(0).getCurrentShownFace() != thePlayers[1].getPlayerDice(1).getCurrentShownFace()));
        
        System.out.println("It took " + counter + " rolls to get a match!");
        
        if (thePlayers[0].isHasWon() && thePlayers[1].isHasWon())
            System.out.println("It was a draw!");
        else if (thePlayers[0].isHasWon())
            System.out.println(thePlayers[0].getPlayerName() + " has won!");
        else if (thePlayers[1].isHasWon())
            System.out.println(thePlayers[1].getPlayerName() + " has won!");
    }
    
}
