/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A0;

/**
 *
 * @author lalim6488
 */
public class A0Q7 {

    public static void main(String[] args) {
        //Sets up a varible that hold the population goal,the poplulation currently living, and the years that have passed
        double population = 6e9;
        double goal = 1e10;
        int year = 1999;
        //Adds up the years that have passed until the population reaches the goal
        while (population < (goal+1)){
            year++;
            population = population + (population*0.014);
        }
        //Tells tghe user what year the population become 1 billion
        System.out.println("It will be " + year + " when the population exceeds 10 billion.");
    }
}
