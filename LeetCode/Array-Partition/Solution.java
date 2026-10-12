1class Solution {
2    public int arrayPairSum(int[] nums)
3     {
4        Arrays.sort(nums);
5        int sum=0;
6        for(int i=0;i<nums.length;i=i+2)
7        {
8            sum=sum+nums[i];
9        }
10        return sum;
11    }
12
13}