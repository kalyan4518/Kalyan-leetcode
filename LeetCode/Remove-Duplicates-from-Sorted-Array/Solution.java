1class Solution {
2    public int removeDuplicates(int[] nums) 
3    {
4        if(nums.length==0)
5         return 0;
6        int i=0;
7        for(int j=1;j<nums.length;j++)
8        {
9            if(nums[j]!=nums[i])
10            {
11                i++;
12                nums[i]=nums[j];
13            }
14        }
15
16        return i+1;
17    }
18}