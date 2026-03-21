1class Solution
2 {
3    public boolean isPalindrome(int x) 
4    {
5        int temp=x;
6        int rev=0;
7        while(temp>0)
8        {
9            int r=temp%10;
10            rev=rev*10+r; 
11
12            temp=temp/10;
13        }
14        if(rev!=x)
15        {
16            return false;
17        }
18        else
19         {
20            return true;
21        }
22    }
23}