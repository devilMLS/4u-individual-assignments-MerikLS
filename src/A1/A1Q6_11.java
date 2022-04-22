/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

/**
 *
 * @author lalim6488
 */
public class A1Q6_11 {

    public static String stringClean(String s) {
        //if the length of the word is less than 2 letter finishes loop
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        //if the first and second letter are the same starts the string without the first letter
        if (s.substring(0,1).equals(s.substring(1,2))) {
            return stringClean(s.substring(1));
        }else{
            //goes through the string character by character
            return s.substring(0,1) + stringClean(s.substring(1));
        }
        
    }

    public static void main(String[] args) {
        //gets the string from the array and outputs it
        String clean = stringClean("hello");
        System.out.println(clean);
    }
}
