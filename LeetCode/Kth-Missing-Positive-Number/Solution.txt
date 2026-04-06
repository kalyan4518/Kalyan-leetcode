1class Solution {
2    public int findKthPositive(int[] arr, int k) 
3    {
4        int n=arr.length;
5        for(int i=0;i<n;i++)
6        {     int j=i+1;
7            int check=arr[i]-j;
8            if(check>=k)
9            {
10                return i+k;
11            }
12        }
13    return n+k;
14    }
15}