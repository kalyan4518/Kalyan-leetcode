1class Solution {
2    public boolean isPalindrome(String s)
3     {
4        String a=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
5        int f=0;
6        int l=a.length()-1;
7        boolean ans=true;
8        while(f<l)
9        {
10            if(a.charAt(f)!=a.charAt(l))
11            { 
12             return false;
13             }
14            else
15            {
16                f++;
17                l--;
18            }
19        }
20      return ans;
21    }
22}