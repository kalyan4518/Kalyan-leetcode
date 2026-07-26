1class Solution {
2    public int maxSubArray(int[] nums) 
3    {
4        int sum=0;
5        int maxsum=Integer.MIN_VALUE;
6        for(int num:nums)
7        {
8            sum=sum+num;
9            maxsum=Math.max(sum,maxsum);
10            if(sum<0)
11            {
12                sum=0;
13            }
14        }
15        return maxsum;
16    }
17}