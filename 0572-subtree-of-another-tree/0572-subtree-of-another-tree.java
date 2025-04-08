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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String fullTree=preOrder(root);

        String subTree=preOrder(subRoot);

        return (fullTree.contains(subTree));
    }
    static String preOrder(TreeNode root){
      if(root==null)
        return null;

      StringBuilder treeSeq=new StringBuilder("^");

      treeSeq.append(root.val);
      treeSeq.append(preOrder(root.left));
       treeSeq.append(preOrder(root.right));

       return treeSeq.toString();
    }
}