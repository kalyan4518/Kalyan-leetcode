1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21     void Helper(Node root,List<Integer>ans)  
22     { 
23        if(root==null)
24        return ;
25        ans.add(root.val);
26        for(Node X:root.children)
27        {
28           Helper(X,ans);
29        }
30        }
31    public List<Integer> preorder(Node root)
32     {
33        List<Integer>ans=new ArrayList<>();
34        Helper(root,ans);
35       return ans; 
36    }
37}