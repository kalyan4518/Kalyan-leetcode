1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) 
3    {
4        HashSet<Integer>s1=new HashSet<>();
5        HashSet<Integer>check=new HashSet<>();
6        for(int i : nums1)
7        {
8            s1.add(i);
9        }
10        for(int j=0;j<nums2.length;j++)
11        {
12            if(s1.contains(nums2[j]))
13            {
14                check.add(nums2[j]);
15                            }
16        }
17        int si=check.size();
18       int []ans=new int[si];
19       int first=0;
20       for(int i : check)
21       {
22        ans[first++]=i;
23       }
24       return ans;
25
26    }
27}