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
public class A1Q1_1 {
    
    public static int bunnyEars(int n) {
        //When n is 0 return 0, stops loop
        if (n == 0) {
            return 0;
        }
        //When n is odd returns 2 plus the last result (which piles up)
        if (n%2 == 1) {
            return 2 + bunnyEars(n-1);
        }
        //When n is even returns 3 plus the last result(which piles up)
        if (n%2 == 0) {
            return 3 + bunnyEars(n-1);
        }
        //Returns final value
        int ears = bunnyEars(n) + bunnyEars(n-1);
        return ears;
    }
    
    public static void main(String[] args) {
        //Gets and outputs method value
        int earR = bunnyEars(300);
        System.out.println(earR);
    }
}
