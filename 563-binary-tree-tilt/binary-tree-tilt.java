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
    int result=0;
    public int findTilt(TreeNode root) {
        tilt(root);
        return result;
        
    }
    public int tilt(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        
        int l=tilt(node.left);
        int r=tilt(node.right);
        
        result+=Math.abs(l-r);
        return l+r+node.val;
    }
}