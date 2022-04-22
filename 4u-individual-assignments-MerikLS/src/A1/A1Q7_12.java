/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;


/**
 *
 * @author Merik
 */
public class A1Q7_12 {

    public static int strDist(String s, String sub) {
        //If s does not contain sub returns one ends loop
        if(!s.contains(sub)){
            return 0;
        }
        //if the first amount of letters equal to subs amount of letter equlas sub then start start a check from the back
        if(s.substring(0,sub.length()).equals(sub)){
            //if the back of s is equal to sub then check the length
            if(s.substring(s.length()-sub.length()).equals(sub)){
                return s.length();
            }else{
                //elimintes all letters from back of s until it meets the if statement
                return strDist(s.substring(0,s.length()-1),sub);
            }
        }else{
            //eliminates the letters from front of s until if stement's met
            return strDist(s.substring(1),sub);
        }
    }

    public static void main(String[] args) {
        //gets and outputs s's length from method
        int wordDistance = strDist("ccatccat","cat");
        System.out.println(wordDistance);
    }

}
