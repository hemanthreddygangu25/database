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
    HashSet<Integer> x = new HashSet<Integer>();
    public int findSecondMinimumValue(TreeNode root) {
        addall(root);
        if(x.size()<=1)
        {
            return -1;
        }
        ArrayList<Integer> y=new ArrayList<>();
        for(int i:x)
        {
            y.add(i);
        }
        Collections.sort(y);
        return y.get(1);
        
    }
    public void addall(TreeNode node)
    {
        if(node == null)
        return;

        x.add(node.val);
        addall(node.left);
        addall(node.right);
    }

}