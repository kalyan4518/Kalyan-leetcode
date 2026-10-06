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
16class Solution
17 {
18    public List<Integer> postorderTraversal(TreeNode root) 
19    {
20        List<Integer>ans=new ArrayList<>();
21          helper(root,ans);
22          return ans;
23    }
24    void helper(TreeNode root,List<Integer>ans)
25    {
26        if(root==null)
27        return ;
28        helper(root.left,ans);
29        helper(root.right,ans);
30        ans.add(root.val);
31    }
32}