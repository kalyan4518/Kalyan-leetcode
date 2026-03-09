1class Solution {
2    public int islandPerimeter(int[][] grid) 
3    {
4        int nowater=0;
5        int land=0;
6        int ans=0;
7        int r=grid.length;
8        int c=grid[0].length;
9        for(int i=0;i<r;i++)
10        {
11            for(int j=0;j<c;j++)
12            {
13                if(grid[i][j]==1)
14                {
15                 land++;
16                 if(i<r-1&&grid[i+1][j]==1)
17                 {
18                    nowater++;
19                }
20                if(j<c-1&&grid[i][j+1]==1)
21                {
22                    nowater++;
23                }
24            }
25        }
26      }
27        ans= (land*4)-(nowater*2);
28        return ans;
29    }
30}