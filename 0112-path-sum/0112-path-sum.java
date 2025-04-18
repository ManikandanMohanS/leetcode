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
    public boolean hasPathSum(TreeNode root, int Sum) {
        if(root==null)
           return false;
        if(root.right==null && root.left==null && Sum==root.val)
           return  true;
        return  hasPathSum(root.left, Sum-root.val) || hasPathSum(root.right, Sum-root.val);

    }
}