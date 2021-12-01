/* You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
 A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */

package com.company;

import java.util.*;
public class Richest_CustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int sum=0,max=0;
        for (int customer = 0; customer < accounts.length; customer++) {
            sum=0;
            for(int bank=0; bank<accounts[customer].length; bank++)
            {
                sum= sum+accounts[customer][bank];
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[][] accounts = new int[3][2];
        System.out.println("Enter each customers bank wealth");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                accounts[i][j] = in.nextInt();
            }
        }
            for(int[] a: accounts)
                System.out.println(Arrays.toString(a));

            System.out.println("Maximum wealth= "+ maximumWealth(accounts));
        }
    }
