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
public class A1Q8_13 {

    public static boolean groupSum(int index, int[] array, int target) {
        //if the numbers can get the target to 0 aka some of the numbers can add to the target return true
        if (target == 0) {
            return true;
        }
        //if all of the points in the array and all combinations have been checked yet the target cannot get to 0 return false
        if (index == array.length) {
            return false;
        }
        //if that point is able to be used to add up to ten stores it as true and uses it to minus the target and uses it when checking all combinations
        if (groupSum(index+1, array,target-array[index])){
            return true;
        }
        //cycles through all points in array
        return groupSum(index+1, array, target);
    }

    public static void main(String[] args) {
        //makes inputs for the array and target for the array to meet aswell as the starting index
        int[] array = {2, 4, 8};
        boolean equals = groupSum(0, array, 100);
        //Outputs if the return staement (true/false)
        System.out.println(equals);
    }
}
