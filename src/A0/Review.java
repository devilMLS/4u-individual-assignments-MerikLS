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
public class Review {
    
    public static void main (String[] args){
        System.out.println("Hello World");
        System.out.print("Hello");
        System.out.print("World\n");
        
        int myAge = 16;
        
        System.out.println("I am " + myAge + " years old!");
        
        int calculatedAge = 2019 - 2003;
        double pi = 3.1459;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("How many appples did you take");
        int apple = input.nextInt();
        
        /*
        Math Operations:
        + : addition
        - : subtraction
        / ; division
        * : multiplication
        Math.pow(base, exponent) : powers
        Math.sqrt(num) : Square root
        % : remainder
        (int)(Math.random()*(max - min + 1) + min) : random number
        math.round(num); round
        math.ceil(num): round up
        math.floor(num): round down
        math.abs(num): absolute (no negative)
        
        Array:
        (normal use square bracket)
        */
        double [] marks = new double [5];
        marks[1] = 76.5;
        marks[0] = 63.7;

        
        for( int i = 0; i < 5; i++){
            System.out.println("Please enter a mark");
            marks [i] = input.nextDouble();
        }
        int count = 0;
        while(count < 5){
            System.out.println("Please enter a mark");
            marks [count] = input.nextDouble();
            count++;
        }
    }
}
