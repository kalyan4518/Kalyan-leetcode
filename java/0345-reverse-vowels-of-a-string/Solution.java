class Solution {
    public String reverseVowels(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        String lower = s.toLowerCase();
        int i=0,j=sb.length()-1;
        while(i<j)
        {

            if("aeiou".indexOf(lower.charAt(i))==-1)
            {
                i++;
            }
            else if("aeiou".indexOf(lower.charAt(j))==-1)
            {
                j--;
            }
            else
            {
                char temp=sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++; 
                j--;
            }
        }
        return sb.toString();

    }
}