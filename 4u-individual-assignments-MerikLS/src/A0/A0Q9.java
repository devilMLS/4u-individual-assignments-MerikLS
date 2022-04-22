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
public class A0Q9 {

    public static void main(String[] args) {
        //Scans in users number
        Scanner input = new Scanner(System.in);
        //Creating all varibles needed to store the word, the length of the word, and then a varible to calculate the average
        String[] wordBank = new String[10];
        int lengthBank = 0;
        int average = 0;
        //Asks you for a word five times and enters them into an array
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter in a word and it will count the total number of characters and average characters per word (you will enter 10 words");
            wordBank[i] = input.nextLine();
        }
        //Accesses all of the words in the array and adds their length to an easier access vairble
        for (int i = 0; i < 10; i++) {
            int lengthShortStore = wordBank[i].length();
            lengthBank = lengthBank + lengthShortStore;
        }
        //calculates average and outputs it
        average = lengthBank/10;
        System.out.println("The average letters per word is " + average + ".");
    }
}
