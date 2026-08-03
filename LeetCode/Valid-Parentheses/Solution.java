1class Solution {
2    public boolean isValid(String s)
3     {
4       Stack<Character> stk = new Stack<>();
5        for(char ch:s.toCharArray())
6        {
7            if(ch=='('||ch=='['||ch=='{')
8             stk.push(ch);
9             else
10             {
11                if(stk.isEmpty())
12                return false;
13                 if (ch == ')' && stk.peek()!= '(')
14                  return false;
15                if (ch == '}' && stk.peek()!= '{')
16                 return false;
17                if (ch == ']' && stk.peek()!= '[')
18                return false;
19                stk.pop();
20             }
21        }
22       return stk.isEmpty();
23    } 
24}