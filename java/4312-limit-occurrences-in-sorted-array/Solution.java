class Solution {
    public int[] limitOccurrences(int[] nums, int k)
    {
          List<Integer>list=new ArrayList<>();
          int i=0,j=1;
           int c=1;
          list.add(nums[0]);
          while(j<nums.length)
          {
            if(nums[i]==nums[j])
                {
                  c++;
                }
            else
                {
                  c=1;
                }
          if(c<=k)
            {
                list.add(nums[j]);
            }
        i++;j++;
         }
          int ans[]=new int[list.size()];
          for(int x=0;x<list.size();x++)
          {
            ans[x]=list.get(x);
          }
          return ans;
    }
}