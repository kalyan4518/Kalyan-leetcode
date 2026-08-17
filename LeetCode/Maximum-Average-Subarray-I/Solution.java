1class Solution {
2    public double findMaxAverage(int[] nums, int k)
3     {
4       int sum=0;
5       for(int i=0;i<k;i++) 
6       {
7        sum=sum+nums[i];
8       }
9       int max=sum;
10       for(int i=1;i<nums.length-k+1;i++)
11       {
12        sum=sum-nums[i-1]+nums[i+k-1];
13        max=Math.max(max,sum);
14       }
15       return (double)max/k;
16    }
17}