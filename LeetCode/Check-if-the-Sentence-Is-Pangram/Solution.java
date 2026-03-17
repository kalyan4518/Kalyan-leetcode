1class Solution {
2    public boolean checkIfPangram(String sentence)
3     {
4        boolean ans=true;
5        int freq[]=new int[26];
6        for(int i=0;i<sentence.length();i++)
7        {
8            char ch=sentence.charAt(i);
9            freq[ch-'a']++;
10        }
11        for(int i=0;i<26;i++)
12        {
13            if(freq[i]==0)
14            {
15                ans=false;
16            }
17        }
18        return ans;
19    }
20}