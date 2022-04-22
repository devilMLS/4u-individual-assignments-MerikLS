/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A0;
import java.util.Scanner;
/**
 *
 * @author lalim6488
 */
public class A0Q2 {
    
    public static void main (String[] args){
        //Allows for inputs from user
        Scanner input = new Scanner(System.in);
        //Asks for 3 numbers gets the product of those, the square of the product and then the square root of the product once this is done tells user the answers
        System.out.println("Please enter three numbers (a number then enter) that you would like the product, the square of the project and then the square root of the project.");
        double numOne = input.nextDouble();
        double numTwo = input.nextDouble();
        double numThree = input.nextDouble();
        double product = numOne*numTwo*numThree;
        double productSquare = Math.pow(product, 2);
        double productRoot = Math.sqrt(product);
        System.out.println("The product of your numbers are " + product + ", the square of that product is " + productSquare + " and the square root of your product is " + productRoot + ".");
    }
}
