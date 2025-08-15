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
   TreeSet<Integer> x = new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        
        addall(root);
        x.pollFirst();
        System.out.println(x.size());
        if (x.isEmpty()) return -1;

        return x.first();

        
    }
    public void addall(TreeNode node)
    {
        if(node==null)
        {
            return ;
        }
        
        x.add(node.val);
        
        addall(node.left);
        addall(node.right);
        
    }
}