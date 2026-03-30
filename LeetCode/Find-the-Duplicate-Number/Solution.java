1class Solution {
2    public int findDuplicate(int[] nums) 
3    {
4        HashMap<Integer,Integer>map=new HashMap<>();
5        for(int n:nums)
6        {
7            map.put(n,map.getOrDefault(n,0)+1);
8        }
9        for(int k:map.keySet())
10        {
11            if(map.get(k)!=1)
12              return k;
13        }
14
15        return -1;
16    }
17
18}