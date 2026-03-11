1class Solution {
2    public char findTheDifference(String s, String t) 
3    {
4        int sum=0;
5        int gum=0;
6
7        for(int i=0;i<s.length();i++)
8        {
9              sum=sum+s.charAt(i);
10            
11        }
12        for(int i=0;i<t.length();i++)
13        {
14              gum+=t.charAt(i); 
15        }
16         int ans=gum-sum;
17         char ch=(char)ans;
18         return ch;
19    }
20}