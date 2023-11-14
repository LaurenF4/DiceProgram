package diceprogram;

import java.util.concurrent.ThreadLocalRandom;
/**
* Author: Lauren
* Date: 31/10/23
**/

public class Dice {
    private static int noOfFaces = 6;
    private int currentShownFace = 1;
    
    public int rollDice(){
        currentShownFace = ThreadLocalRandom.current().nextInt(1, noOfFaces+1);
        return currentShownFace;
    }
    
    public static void setNumberOfFaces(int noOfFaces){
        Dice.noOfFaces = noOfFaces;
    }
    
    public static int getNumberOfFaces(){
        return noOfFaces;
    }
    
    public int getCurrentShownFace(){
        return currentShownFace;
    }
}