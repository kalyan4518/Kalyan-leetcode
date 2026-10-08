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
17    public int minDepth(TreeNode root)
18     {
19        if(root==null)
20        return 0;
21        if(root.right==null)
22        return 1+minDepth(root.left);
23        
24        if(root.left==null)
25        return 1+minDepth(root.right);
26
27        int leftans=minDepth(root.left);
28        int rightans=minDepth(root.right);
29        return 1+Math.min(leftans,rightans);
30    }
31}