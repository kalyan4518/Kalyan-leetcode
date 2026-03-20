1class Solution {
2    public boolean isPowerOfTwo(int n)
3    {
4        boolean ans=false;
5        if(n==0)
6        return false;
7        while(n%2==0)
8        {
9            n=n/2;
10        }
11        if(n==1)
12        return true;
13       return ans;
14    }
15}