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
public class A1Q4_4 {

    public static int count7(int n) {
        //If n = 0 returns 0 ends loop
        if (n == 0) {
            return 0;
        }
        //If the bottom value is 7 adds 7 to the last value continues to add up each of the sevens
        if ((n % 10) == 7) {
            return 1 + count7(n / 10);
        } else {
            //Returns value
            return count7(n / 10);
        }
    }

    public static void main(String[] args) {
        //gets and outputs method value
        int countNumber = count7(43797174);
        System.out.println(countNumber);
    }
}
