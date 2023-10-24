package diceprogram;

/**
 * author: ME
 * date: 05/10/22
 */
public class DiceProgram {
    
    public static void main(String[] args) {

        Player player1 = new Player();
        player1.setPlayerName("Lauren");
        System.out.println(player1.getPlayerName() + " rolled a " + player1.getPlayerDice().rollDice()+ " and a " + player1.getPlayerDice().rollDice());
        
        Player player2 = new Player();
        player2.setPlayerName ("Angus");
        System.out.println(player2.getPlayerName() + " rolled a " + player2.getPlayerDice().rollDice()+ " and a " + player2.getPlayerDice().rollDice());
        
        
    }
    
}
