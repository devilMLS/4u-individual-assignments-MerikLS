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
public class Excample {

    //finds nth fibonacci number
    public static int fibLoop(int n) {
        //array to store numbers
        int[] numbers = new int[n + 1];
        numbers[0] = 1;
        numbers[1] = 1;
        // iterate over the numbers to make fib numbers 
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        //return the answer
        return numbers[n];
    }
    public static int gcd(int a, int b){
        //baseCase
        if(b==0){
            return a;
        }
        int divisor = gcd(b, a%b);
        return divisor;
    }
    
    public static int fibR(int n) {
        //base case
        //0th or 1st term of fibbonacci number
        if(n==0 || n==1){
            return 1;
        }
        int num = fibR(n-1) + fibR(n -2);
        return num;
    }

    public static void main(String[] args) {
        int f20 = fibLoop(20);
        System.out.println(f20);
        int f5R = fibR(5);
        System.out.println(f5R);
        int div = gcd(5000,754);
        System.out.println(div);
        
    }
    
}
