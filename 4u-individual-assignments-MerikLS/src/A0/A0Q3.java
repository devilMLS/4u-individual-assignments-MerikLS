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
public class A0Q3 {
    
    public static void main (String[] args){
        //Creates scanners that allow for input
        Scanner input = new Scanner(System.in);
        //Creates an array that stores the party cost
        double [] partyCosts = new double [3];
        //Creates varibles for the total cost and the amount of tickets needed to sell 
        double totalCost = 0;
        double ticketAmount = 0;
        //Asks for the cost 3 times adds them to array
        for(int i = 0; i < 3; i++){
            System.out.println("Enter one of your costs");
            partyCosts [i] = input.nextDouble();
        }
        //Adds all the costs to another varible
        for (int i = 0; i < 3; i++){
            totalCost = totalCost + partyCosts[i];
        }
        //Calculates the tickets need and rounds up then tells user the amount of tickets needed
        ticketAmount = totalCost/35;
        ticketAmount = Math.ceil(ticketAmount);
        System.out.println("You need to sell " + ticketAmount + " tickets to break even.");
    }
}
