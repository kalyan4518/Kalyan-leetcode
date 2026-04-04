1class Solution {
2    public List<Integer> findLonely(int[] nums)
3     {
4        List<Integer>ans=new ArrayList<>();
5        HashMap<Integer,Integer>map=new HashMap<>();
6        for(int i=0;i<nums.length;i++)
7        {
8               map.put(nums[i],map.getOrDefault(nums[i],0)+1);
9        }
10        
11        for(int k:map.keySet())
12        {
13            if(map.get(k)==1&&!map.containsKey(k-1)&&!map.containsKey(k+1))
14            {
15                ans.add(k);
16            }
17        }
18        return ans;
19    }
20}