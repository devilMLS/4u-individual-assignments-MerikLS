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
public class A0Q1 {
    
    public static void main (String[] args){
        //allows for user to interact with program
        Scanner input = new Scanner(System.in);
        //asks for name and then once the computer is told your name tells you hello name
        System.out.println("Excuse me, what is your name");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!");
        
    }
    
}