/* There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.

Example 1:
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
 */
package com.company;

import java.util.*;
public class Kids_GreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        int max=0;
        for(int candy: candies){
            max=Math.max(candy,max);
        }
        for(int candy:candies){
            list.add(candy+extraCandies>=max);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] candies = new int[5];
        System.out.println("Enter candies with each kid");
        for (int i = 0; i < 5 ; i++) {
            candies[i]=in.nextInt();
        }
        System.out.println("Enter number of extra candies");
        int extraCandies=in.nextInt();
        System.out.println((kidsWithCandies(candies,extraCandies)));
    }
}
