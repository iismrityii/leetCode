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
    int count = 0;
    public int countDominantNodes(TreeNode root) {
        int max = helper(root);
        return count;
    }

    int helper(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int temp = Math.max(helper(node.left), helper(node.right));

        if (node.val >= temp) {
            count++;
        }

        return Math.max(node.val, temp);
    }
}