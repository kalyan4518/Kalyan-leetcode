1class Solution {
2    public int uniquePaths(int m, int n) 
3    {
4        int ans=0;
5        int a[][]=new int[m+1][n+1];
6        for(int i=0;i<m;i++)
7        {
8            for(int j=0;j<n;j++)
9            {
10                a[0][j]=1;
11                a[i][0]=1;
12            }
13        }
14        for(int i=1;i<=m;i++)
15        {
16            for(int j=1;j<=n;j++)
17            {
18                a[i][j]=a[i-1][j]+a[i][j-1];
19            }
20        }
21        return a[m-1][n-1];
22    }
23}