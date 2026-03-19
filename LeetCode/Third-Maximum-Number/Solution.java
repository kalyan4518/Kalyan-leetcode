1class Solution {
2    public int thirdMax(int[] nums)
3     {
4        long m1=Long.MIN_VALUE;
5        long m2=Long.MIN_VALUE;
6        long m3=Long.MIN_VALUE;
7        for(int i=0;i<nums.length;i++)
8        {
9            if(nums[i]==m1||nums[i]==m2||nums[i]==m3)
10            continue;
11          
12            if(nums[i]>m1)
13            {
14               m3=m2;
15               m2=m1;
16               m1=nums[i];
17            }
18            else if(nums[i]>m2)
19            {
20                m3=m2;
21                m2=nums[i];
22    
23            }
24            else if(nums[i]>m3)
25            m3=nums[i];
26        }
27        if(m3==Long.MIN_VALUE)
28        return (int)m1;
29
30        return (int)m3;
31    }
32}