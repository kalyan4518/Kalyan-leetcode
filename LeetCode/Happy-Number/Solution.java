1class Solution {
2    public boolean isHappy(int n) 
3    {
4        boolean ans=true;
5        HashSet<Long>used=new HashSet<>();
6        while(n!=0&&!used.contains((long)n))
7        {
8            used.add((long)n);
9            long sum=0;
10            while(n!=0)
11            {
12                long r=n%10;
13                sum=sum+r*r;
14                n=n/10;
15            }
16            n=(int)sum;
17         }
18         if(n!=1)
19        ans=false;
20       return ans;
21}
22}