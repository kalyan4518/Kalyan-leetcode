1class Solution {
2    public int heightChecker(int[] heights)
3    {
4        int count=0;
5        int ans[]=new int[heights.length];
6        for(int i=0;i<heights.length;i++)
7        {
8            ans[i]=heights[i];
9        }
10        Arrays.sort(heights);
11        for(int i=0;i<heights.length;i++)
12        {
13            if(ans[i]!=heights[i])
14            {
15                count++;
16            }
17        }
18        return count;
19    }
20}