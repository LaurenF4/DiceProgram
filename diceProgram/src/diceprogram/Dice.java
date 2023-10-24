package diceprogram;

/**
 * author: Lauren F
 * date:05/10/22
 */
import java.util.concurrent.ThreadLocalRandom;
public class Dice {
    private static int noOfFaces = 6;
    private int currentShownFace = 4;
    
    public int rollDice(){
        currentShownFace = ThreadLocalRandom.current().nextInt(1, noOfFaces+1);
        return currentShownFace;
    }
    
    public void getNumberOfFaces(int noOfFaces){
        this.noOfFaces = noOfFaces; 
    }
    public int getNumberOfFaces(){
        return noOfFaces;
    }
    public int getCurrentShownFace(){
        return currentShownFace;
    }
    
}
