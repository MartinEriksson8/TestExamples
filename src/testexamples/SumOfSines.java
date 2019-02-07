/*
 * Martin Eriksson & Associates 2019
 */
package testexamples;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class SumOfSines {
    //this program takes a double command-line argument t (in degrees) and prints the value of sin(2t) + sin(3t).
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        double degrees = sc1.nextInt();
        double radians = Math.toRadians(degrees);
        double sum = Math.sin(2*radians)+ Math.sin(3*radians);
        
        System.out.println(sum);
    }
}
