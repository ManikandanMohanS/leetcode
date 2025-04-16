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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            inorderIndexMap.put(inorder[i], i);
        
        return build(postorder, inorderIndexMap, 
                     postorder.length - 1, 
                     0, inorder.length-1 );
    }

    private TreeNode build(int[] postorder, Map<Integer, Integer> inorderMap, 
                           int postIndex, int inLeft, int inRight) {
        if (inLeft > inRight) return null;

        int rootVal = postorder[postIndex];
        TreeNode root = new TreeNode(rootVal);

        int inIndex = inorderMap.get(rootVal);
        int rightCount = inRight - inIndex;

        root.right = build(postorder, inorderMap, 
                           postIndex - 1, inIndex + 1, inRight);

        root.left = build(postorder, inorderMap, 
                          postIndex - rightCount - 1, inLeft, inIndex - 1);

        return root;
    }
}
