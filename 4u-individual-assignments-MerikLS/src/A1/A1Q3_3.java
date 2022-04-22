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
public class A1Q3_3 {

    public static int sumDigits(int n) {
        //If n = 0 returns 0 (ends method looping)
        if(n == 0){
            return 0;
        }else{
            //Adds the digits of the number together
            int digitAdd = n%10 + sumDigits(n/10);
            return digitAdd;
        }
    }
    public static void main(String[] args) {
        //Gets and outputs method value
        int digitTotal = sumDigits(937);
        System.out.println(digitTotal);
    }
}
