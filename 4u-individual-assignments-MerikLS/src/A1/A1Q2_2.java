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
public class A1Q2_2 {

    public static int triangle(int n) {
        //When n equals 0 stops loop
        if (n == 0) {
            return (0);
        }else{
            //Adds n to its past self making the trianlge increase by a constant aswell as stacking it
            int triangleLevel = n + triangle(n-1);
            return triangleLevel;
        }
    }

    public static void main(String[] args) {
        //Gets triangle method value into main method and outputs it
        int sidePrint = triangle(2);
        System.out.println(sidePrint);
    }
}
