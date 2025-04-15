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
    TreeNode prev=null,curr=null;
    boolean result=true;
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return result;
    }

    public void inOrder(TreeNode root){
        if(root==null)
           return;
        inOrder(root.left);
         if(curr!=null){
          prev=curr;
          curr=root;
             if(curr.val<=prev.val)
                 result=false;
              }
         else{
            curr=root;
         }

         inOrder(root.right);
    }
}