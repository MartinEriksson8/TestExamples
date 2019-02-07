/*
 * Martin Eriksson & Associates 2019
 */
package testexamples;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Distance {
    
    //this program takes a coordinate (x,y) and calculates the distance to (0,0)
    public static void main(String args[]) 
    {  
        //using scanner to get input from user and assigning the value to X and Y
        Scanner sc0 = new Scanner(System.in);
        int x = sc0.nextInt();
        
        
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();
        
        //the square root of (x^2+y^2) gives us the distance (pythagoras theorem)
        double dist = Math.sqrt((x*x + y*y));
        
        System.out.println("Distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
