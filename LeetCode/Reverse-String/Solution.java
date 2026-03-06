1class Solution {
2    public void reverseString(char[] s)
3     {
4        int r=s.length-1;
5        int l=0;
6        while(l<r)
7        {
8            char change=s[l];
9            s[l]=s[r];
10            s[r]=change;
11
12            l++;
13            r--;
14        }
15    }
16}