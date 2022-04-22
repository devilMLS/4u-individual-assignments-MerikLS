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
public class A1Q9_10 {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(String s) {
        if (s.charAt(s.length() - 1) == s.charAt(0)) {
            if (s.length() == 0 || s.length() == 1) {
                return true;
            }
            return isPalindrome(s.substring(1, s.length() - 1));
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        boolean bruh = isPalindrome("radar");
        System.out.println(bruh);
    }

}
