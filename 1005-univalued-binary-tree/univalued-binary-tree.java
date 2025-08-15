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
    HashSet<Integer> x=new HashSet<>();
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
        {
            return false;
        }
        addall(root);
        if(x.size()<=1)
        {
            return true;
        }
        return false;
        
    }
    public void addall(TreeNode node)
    {
        if(node==null) return;
        x.add(node.val);
        addall(node.left);
        addall(node.right);
    }
}