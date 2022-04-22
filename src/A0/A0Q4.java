/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A0;

import java.util.Scanner;

/**
 *
 * @author lalim6488
 */
public class A0Q4 {
    
    public static void main (String[] args){
        //Creates scanners that allow for input
        Scanner input = new Scanner(System.in);
        //Creates a string that will hold the asterisks
        String row = new String();
        //Asks user to enter a number between 1 and 10 that will become the value of asterisks then implements it into varible
        System.out.println("Enter a number between 1 and 10 to become a row of astericks of that value.");
        int asterisks = input.nextInt();
        //if the number they enter isn't between 1 and 10 asks them the question until they enter a usable value
        while(asterisks < 1 || asterisks > 10){
            System.out.println("Enter a number between 1 and 10.");
            asterisks = input.nextInt();
        }
        //Adds asterisks to row until there are the amount of asterisks asked for
        for(int i = 0; i < asterisks; i++){
            row = row + "*";
        }
        //Outputs the row of asterisks
        System.out.println(row);
    }
}
