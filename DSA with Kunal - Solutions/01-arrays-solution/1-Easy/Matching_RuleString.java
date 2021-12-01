/* You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
 You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:
ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

Example 1:
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 */
package com.company;

import java.util.*;
public class Matching_RuleString {
    public static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        String t;
        int ctr = 0;
        switch (ruleKey) {
            case "type" -> {
                for (int i = 0; i < items.size(); i++) {
                    t = items.get(i).get(0);
                    if (t.equalsIgnoreCase(ruleValue)) {
                        ctr++;
                    }
                }
                return ctr;
            }
            case "color" -> {
                for (int i = 0; i < items.size(); i++) {
                    t = items.get(i).get(1);
                    if (t.equalsIgnoreCase(ruleValue)) {
                        ctr++;
                    }
                }
                return ctr;
            }
            case "name" -> {
                for (int i = 0; i < items.size(); i++) {
                    t = items.get(i).get(2);
                    if (t.equalsIgnoreCase(ruleValue)) {
                        ctr++;
                    }
                }
                return ctr;
            }
            default -> System.out.println("Enter a valid rule key");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            list.add(new ArrayList<>());
        }
        System.out.println("Enter the list");
        for(int i=0; i<list.size(); i++)
        {
            for(int j=0; j<list.size(); j++)
            {
                list.get(i).add(in.nextLine());
            }
        }
        System.out.println("Enter rule key and rule value");
        String rule_key=in.next();
        String rule_value=in.nextLine();
        System.out.println("Matching rule followed by: "+countMatches(list,rule_key,rule_value));

    }
}
