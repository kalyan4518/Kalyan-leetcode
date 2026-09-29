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
17    public List<List<Integer>> levelOrder(TreeNode root)
18     {
19        List<List<Integer>>ans=new ArrayList<>();
20        if(root==null)
21        return ans;
22        Queue<TreeNode>q=new LinkedList<>();
23        q.add(root);
24        q.add(null);
25        List<Integer>a=new ArrayList<>();
26        while(!q.isEmpty())
27        {
28            TreeNode f=q.remove();
29            if(f==null)
30            {
31                  ans.add(new ArrayList<>(a));
32                  a.clear();
33                  if(!q.isEmpty())
34                  {
35                    q.add(null);
36                  }
37            }
38            else
39            {
40                a.add(f.val);
41                if(f.left!=null)
42                q.add(f.left);
43                if(f.right!=null)
44                q.add(f.right);
45            }
46        }
47        return ans;
48    }
49}