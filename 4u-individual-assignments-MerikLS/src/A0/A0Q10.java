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
public class A0Q10 {

    public static void main(String[] args) {
        //Allows for user inputs
        Scanner input = new Scanner(System.in);
        //varible that controls if the endless while statement will loop
        boolean exitCheck = true;
        while (exitCheck == true) {
            //Asks user for a word and inputs it into the program
            System.out.println("Enter a word and I will output the first and the last character.(Type 'exit' to exit)");
            String word = input.nextLine();
            //while the word is less than two characters asks them for a word until one is acceptable
            while (word.length() < 2) {
                    System.out.println("The word entered has only 1 character character. Enter a letter and I will output the first and the last character.(Type 'exit' to exit)");
                    word = input.nextLine();
                }
            //When they type exit ends the loop/ program by setting exit varible to false
            if (word.equals("exit")) {
                System.out.println("Goodbye");
                exitCheck = false;
            } else {
                //Finds out the first and last letter of the word and ouputs them to the user
                char letterFirst = word.charAt(0);
                char letterLast = word.charAt(word.length() - 1);
                System.out.println("The first letter of your word is " + letterFirst + " and the last letter is " + letterLast + ".");
            }
        }
    }
}
