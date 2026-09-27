1class Solution {
2    public int uniquePathsIII(int[][] grid)
3     {
4        int zero=0,sx=0,sy=0;
5    for(int r=0;r<grid.length;r++)
6    {
7    for(int c=0;c<grid[0].length;c++)
8        {
9            if(grid[r][c]==0)
10            zero++;
11            else if(grid[r][c]==1)
12            {
13                sx=r;
14                sy=c;
15            }
16        }
17      }
18      return dfs(grid,sx,sy,zero);
19     }
20     private int dfs(int grid[][],int x,int y,int zero)
21     {
22        if(x<0||x>=grid.length||y<0||y>=grid[0].length)
23        return 0;
24
25        if(grid[x][y]==-1)
26        return 0;
27
28        if(grid[x][y]==2)
29        {
30            if(zero==-1)
31            return 1;
32            else
33            return 0;
34        }
35
36        int temp=grid[x][y];
37        grid[x][y]=-1;
38        zero--;
39        int totalpaths= 
40        dfs(grid,x+1,y,zero)+
41        dfs(grid,x-1,y,zero)+
42        dfs(grid,x,y-1,zero)+
43        dfs(grid,x,y+1,zero);
44
45        grid[x][y]=temp;
46        return totalpaths;
47     }
48}