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
public class A0Q6 {
    
    public static void main(String[] args) {
        //Allows user input
        Scanner input = new Scanner(System.in);
        //Asks for a number between 50 and 100 and attaches it to a varible
        System.out.println("Enter a number between 50 and 100 to stop at:");
        int stopper = input.nextInt();
        //Sets up the value that will be decreased by 5
        int fiveSlide = 100;
        //If the number isn't between 50 and 100 then asks the user for a new number until the condition is met
        while (stopper < 50 || stopper > 100){
            System.out.println("That value is unacceptable enter a correct one between 50 and 100:");
            stopper = input.nextInt();
        }
        //Outputs the decline of 5's
        while(stopper <= fiveSlide){
            System.out.println(fiveSlide);
            fiveSlide = fiveSlide - 5;
        }
    }
}
