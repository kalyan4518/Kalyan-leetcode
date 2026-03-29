1class Solution {
2    public int majorityElement(int[] nums)
3     {
4        HashMap<Integer,Integer>a=new HashMap<>();
5        for(int i=0;i<nums.length;i++)
6        {
7            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
8        }
9        int max=0;
10        int ans=-1;
11        for(int k:a.keySet())
12        {
13            if(a.get(k)>max)
14            {
15                max=a.get(k);
16                ans=k;
17            }
18        }
19     return ans;
20        
21    }
22}