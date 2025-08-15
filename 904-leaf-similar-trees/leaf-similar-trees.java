/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> x=new ArrayList<>();
    ArrayList<Integer> y=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null)
        {
            return false;
        }
        add1(root1);
        add2(root2);
        return x.equals(y);
    }
    public void add1(TreeNode root1)
    {
        if(root1==null)
        {
            return ;
        }
        if(root1.left==null && root1.right==null)
        {
            x.add(root1.val);
        }
        add1(root1.left);
        add1(root1.right);
    }
    public void add2(TreeNode root2)
    {
        if(root2==null)
        {
            return ;
        }
        if(root2.left==null && root2.right==null)
        {
            y.add(root2.val);
        }
        add2(root2.left);
        add2(root2.right);
    }
}