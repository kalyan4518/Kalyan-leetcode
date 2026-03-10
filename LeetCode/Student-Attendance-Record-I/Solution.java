1class Solution {
2    public boolean checkRecord(String s) 
3    {
4        boolean ans=true;
5        int count=0;
6        if(s.contains("LLL"))
7        return ans=false;
8          for(int i=0;i<s.length();i++)
9          {
10            char ch=s.charAt(i);
11           if(ch=='A')
12           {
13            count++;
14           }
15           if(count>=2)
16           ans=false;
17           }
18      return ans;
19    }
20}