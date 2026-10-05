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
17    public int rangeSumBST(TreeNode root, int low, int high)
18     { 
19           if(root==null)
20           return 0;
21           if(root.val<low)
22           return rangeSumBST(root.right,low,high);
23           if(root.val>high)
24           return rangeSumBST(root.left,low,high);
25            
26         return root.val+rangeSumBST(root.right,low,high)+rangeSumBST(root.left,low,high);
27        
28    } 
29}