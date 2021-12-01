package com.company;
//Question: https://leetcode.com/problems/first-bad-version/submissions/

public class BadVersion {
    public int firstBadVersion(int n) {
        int start=1, end=n, bad=0;
        while(start<=end)
       {
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)==false) //if the mid element is not bad
                start=mid+1;
            else                         //if the mid element is bad version
            {
                bad=mid;                 //probably the found value is the first bad version
                end=mid-1;               //but it's not sure, so we'll check it's previous elements also.
            }
        }
        return bad;
    }
}
