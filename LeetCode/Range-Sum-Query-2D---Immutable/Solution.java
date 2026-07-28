1class NumMatrix {
2      long[][] prefix;
3
4    public NumMatrix(int[][] matrix)
5     {
6        prefix = new long[matrix.length][matrix[0].length];
7
8         for(int i=0;i<matrix.length;i++)
9        {
10            prefix[i][0]=matrix[i][0];
11        }
12        for(int i=0;i<matrix.length;i++)
13        {
14            for(int j=1;j<matrix[0].length;j++)
15            {
16                prefix[i][j]+=prefix[i][j-1]+ matrix[i][j];
17            }
18        }
19        for(int i=1;i<matrix.length;i++)
20        {
21            for(int j=0;j<matrix[0].length;j++)
22            {
23                prefix[i][j]+=prefix[i-1][j];
24            }
25        }
26    }
27    
28    public int sumRegion(int row1, int col1, int row2, int col2) 
29    {
30        long ans=prefix[row2][col2];
31                if(row1>0)
32                ans-=prefix[row1-1][col2];
33                if(col1>0)
34                ans-=prefix[row2][col1-1];
35                if(row1>0&&col1>0)
36                ans+=prefix[row1-1][col1-1];
37        
38        return (int)ans;
39
40    }
41}
42
43