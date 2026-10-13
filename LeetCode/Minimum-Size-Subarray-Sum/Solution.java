1class Solution {
2    public int minSubArrayLen(int target, int[] nums) 
3    {
4        int i=0,j=0;
5        int sum=0;
6        int min=Integer.MAX_VALUE;
7        for(i=0;i<nums.length;i++)
8        {
9            sum=sum+nums[i];
10            if(sum>=target)
11            {
12                while(j<=i)
13                {
14                    min=Math.min(min,i-j+1);
15                    sum=sum-nums[j];
16                    j++;
17                    if(sum<target)
18                    break;
19
20                }
21            }
22        }
23        if(min==Integer.MAX_VALUE)
24        return 0;
25        return min;
26    }
27}