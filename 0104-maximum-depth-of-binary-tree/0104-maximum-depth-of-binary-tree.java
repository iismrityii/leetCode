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
    private int solve(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int depth = 1 + Math.max(solve(root.left), solve(root.right));
        return depth;
    }

    public int maxDepth(TreeNode root) {
        return solve(root);
    }
}