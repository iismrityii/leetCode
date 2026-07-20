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
    List<Integer> ans;
    private void solve(TreeNode root) {
        if(root == null) {
            return;
        }

        ans.add(root.val);
        solve(root.left);
        solve(root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }

        solve(root);
        return ans;
    }
}