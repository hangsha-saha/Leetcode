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

    public void helper(TreeNode n1, int lvl, List<List<Integer>> ans) {
        if(n1 == null)
            return;
        if(lvl == ans.size()) {
            ans.add(new ArrayList<>());
        }
        ans.get(lvl).add(n1.val);
        helper(n1.left, lvl + 1, ans);
        helper(n1.right, lvl + 1, ans);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, 0, ans);
        return ans;
    }
}