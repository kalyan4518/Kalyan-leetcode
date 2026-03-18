1class Solution {
2    public int lengthOfLastWord(String s)
3    {
4        int count=0;
5        for(int i=s.length()-1;i>=0;i--)
6        {
7           char ch=s.charAt(i);
8           if(ch==' ')
9           {
10             if(count>0)
11             break;
12           }
13           else
14           count++;
15    
16        }
17        return count;
18    }
19}