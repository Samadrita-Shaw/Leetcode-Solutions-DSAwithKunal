/* Given an integer n, return any array containing n unique integers such that they add up to 0.
Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:
Input: n = 3
Output: [-1,0,1]
Example 3:
Input: n = 1
Output: [0]
 */
package com.company;

import java.util.*;
public class IntegerSumUpto0
{
    public static int[] sumZero(int n)
    {
        int[] arr = new int[n];
        int k=-n/2;
        for(int i=0; i<n ;i++)
        {
            if(n%2==0 && k==0)
            {
                k=k+1;
            }
            arr[i]=k;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        System.out.println(Arrays.toString(sumZero(n)));
    }
}
