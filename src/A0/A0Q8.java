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
public class A0Q8 {
    
    public static void main(String[] args) {
        //Scans in users number
        Scanner input = new Scanner(System.in);
        //Asks user for their balance and interest rate makes a value for the money going to 1 million and needed to double
        System.out.println("What is the balalnce in your savings account?");
        double doubleSaving = input.nextDouble();
        double goal = doubleSaving*2;
        double millionSaving = doubleSaving;
        System.out.println("What is the interest rate? (in percent)");
        double interestRate = input.nextDouble();
        interestRate = interestRate/100;
        //Stores both year values
        int doubleYear = 0;
        int millionYear = 0;
        //Adds up the years that have passed the saving reach double and 1 million
        while (doubleSaving < (goal)){
            doubleYear++;
            doubleSaving = doubleSaving + (doubleSaving*interestRate);
        }
        while(millionSaving < 1e6){
            millionYear++;
            millionSaving = millionSaving + (millionSaving*interestRate);
        }
        //Tells the user what the amount of years until they have douubled their money and until their money reaches 1 million dollars
        System.out.println("It will take " + doubleYear + " years for your money to double.");
        System.out.println("It will take " + millionYear + "years for the savings to reach 1 million dollars");
    }
}

