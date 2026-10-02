1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
18    {
19        List<List<Integer>>ans=new ArrayList<>();
20        if(root==null)
21        return ans;
22        Stack<TreeNode>s1=new Stack<>();
23        Stack<TreeNode>s2=new Stack<>();
24        s1.push(root);
25        while(!s1.isEmpty()||!s2.isEmpty())
26        {
27        List<Integer>a=new ArrayList<>();
28            while(!s1.isEmpty())
29            {
30            TreeNode n=s1.pop();
31            a.add(n.val);
32            if(n.left!=null)
33            s2.add(n.left);
34           if(n.right!=null)
35             s2.add(n.right);
36            }
37            if(!a.isEmpty())
38            ans.add(a);
39             a = new ArrayList<>();
40            while(!s2.isEmpty())
41            {
42            TreeNode n=s2.pop();
43             a.add(n.val);
44             if(n.right!=null)
45            s1.add(n.right);
46            if(n.left!=null)
47            s1.add(n.left);
48            }
49if(!a.isEmpty())
50            ans.add(a);
51        }
52        return ans;
53    }
54}