/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode helper(TreeNode n1, TreeNode p, TreeNode q){
        if(n1 == null)
            return null;
        if(n1 == p || n1 == q)
            return n1;
        TreeNode left = helper(n1.left, p, q);
        TreeNode right = helper(n1.right, p, q);
        if (left != null && right != null) 
            return n1;
        if(left != null)
            return left;
        else
            return right;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root, p, q);
    }
}