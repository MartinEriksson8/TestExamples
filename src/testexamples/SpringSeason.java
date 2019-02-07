/*
 * Martin Eriksson & Associates 2019
 */
package testexamples;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class SpringSeason {
    //this program takes two intergers date and moth and checks if the specified date is in the spring season (spring season defined as 20/3 - 20/6)
    
    public static void main(String args[]){
        //scanning for date and month input
        Scanner sc1 = new Scanner(System.in);
        int date = sc1.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        int month = sc2.nextInt();
        
        boolean isSpring;
        
        if(month>=3 && month<=6){
            if(month==6 && date<20){
                isSpring = true;
            }
            else if(month==3 && date>20){
                isSpring = true;
            }
            else{
                isSpring = true;
            }
        }
        else{
            isSpring = false;
        }
        if(isSpring){
            System.out.println("It's spring!");
        }
        else{
        System.out.println("It's not spring :(");
        }
    }
}
