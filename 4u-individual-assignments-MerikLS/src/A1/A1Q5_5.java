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
public class A1Q5_5 {

    public static String changeXY(String s) {
        //Once the length of s equals zero stops the s loop
        if(s.length() == 0){
            return s;
        }
        //If the first letter of s is x gets the first letter of s changes it to y and adds it to the rest of the word stored in the method
        if (s.substring(0, 1).equals("x")){
           return "y" + changeXY(s.substring(1));
        }
        //returns the first letter of s (which should be change to y if x and nothing changes if fine) and adds the letter to s which is being scaled down until the final letter is reached
        return s.substring(0,1) + changeXY(s.substring(1));
    }

    public static void main(String[] args) {
        //gets and outputs method string
        String y = changeXY("xxbjx");
        System.out.println(y);
    }
}
