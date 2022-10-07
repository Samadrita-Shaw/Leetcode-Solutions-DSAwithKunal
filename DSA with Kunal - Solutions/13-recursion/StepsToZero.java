/* Question: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */

import java.util.Scanner;

public class StepsToZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println(numberOfSteps(n));
    }
    public static int numberOfSteps(int num) {
        return stepsHelper(num, 0);
    }
    public static int stepsHelper(int n, int steps){
        if(n==0)
            return steps;

        if(n%2 == 0)
            return stepsHelper(n/2, steps+1);

        return stepsHelper(n-1, steps+1);
    }

}

