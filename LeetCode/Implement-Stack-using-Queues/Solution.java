1class MyStack 
2{
3    Queue<Integer> q1;
4   Queue<Integer> q2;
5public MyStack() 
6{
7    q1 = new LinkedList<>();
8    q2 = new LinkedList<>();
9}
10    
11    public void push(int x)
12     {
13        q1.add(x);
14        
15    }
16    
17    public int pop()
18     {
19        while(q1.size()>1)
20        {
21            q2.add(q1.remove());
22        }
23      int  ans= q1.remove();
24       while(!q2.isEmpty())
25       {
26        q1.add(q2.remove());
27       }
28        return ans;
29    }
30    
31    public int top() 
32    {
33       while(q1.size()>1)
34       {
35        q2.add(q1.remove());
36       }
37       int top=q1.remove();
38       q2.add(top);
39       while(!q2.isEmpty())
40       {
41        q1.add(q2.remove());
42       }
43       return top;
44    }
45    
46    public boolean empty() 
47    {
48       return q1.isEmpty();
49    }
50}
51
52/**
53 * Your MyStack object will be instantiated and called as such:
54 * MyStack obj = new MyStack();
55 * obj.push(x);
56 * int param_2 = obj.pop();
57 * int param_3 = obj.top();
58 * boolean param_4 = obj.empty();
59 */