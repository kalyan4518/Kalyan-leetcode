1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold)
3     {
4        int sum=0;
5        int count=0;
6        for(int i=0;i<k;i++)
7        {
8            sum=sum+arr[i];
9        }
10        if(sum/k>=threshold)
11          count++;
12        int max=sum;
13       for(int i=1;i<arr.length-k+1;i++)
14       {
15            sum=sum-arr[i-1]+arr[i+k-1];
16            if(sum/k>=threshold)
17            count++;
18       }
19       return count;
20    }
21}