1class Solution {
2    public int searchInsert(int[] nums, int target)
3     {
4        int i=0;
5        int j=nums.length-1;
6        int ans=-1;
7        while(i<=j)
8        {
9            int mid=(i+j)/2;
10            if(nums[mid]==target)
11            {
12                return mid;
13            }
14            if(nums[mid]<target)
15            {
16            ans=i;
17            i=mid+1;
18            }
19            else
20               { 
21                j=mid-1;
22            }
23        }
24        return i;
25    }
26}