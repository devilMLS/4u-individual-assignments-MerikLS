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
public class RecursionTest {

    /**
     * @param args the command line arguments
     */
    public static String reverse(String s) {
        //base case checks if the string is one or zero long then does recursive method to return the word backward
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        //cycles through the word and adds the last letter to the beginning
        return s.substring(s.length()-1,s.length()) + reverse(s.substring(0,s.length()-1));
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Allows for a word to be entered into the method then outputs the reversed word
        String reversed = reverse("eeaeeee");
        System.out.println(reversed);
    }

}
