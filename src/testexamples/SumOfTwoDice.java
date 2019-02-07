/*
 * Martin Eriksson & Associates 2019
 */
package testexamples;

/**
 *
 * @author Martin
 */
public class SumOfTwoDice {
    //This program takes the value of two random integers between 1 and 6 (a dice) and adds them together.
    
    public static void main(String args[]){
        
        for(int i=0; i<=10; i++){
        //using math.ceil method to bind the value between 1 and 6 
        int d1 = (int) Math.ceil(Math.random() * 6);
        int d2 = (int) Math.ceil(Math.random() * 6);
        
        //printing separate and combined values of our digital dice
        System.out.println("Dice nr1 value: " + d1);
        System.out.println("Dice nr2 value: " + d2);
        
        System.out.println("Combined value: " + (d1+d2));
        
        }
        
    }
}
