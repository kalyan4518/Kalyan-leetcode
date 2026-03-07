1class Solution {
2    public String defangIPaddr(String address) 
3    {
4        String ans=address.replace(".","[.]");
5        return ans;
6    }
7}