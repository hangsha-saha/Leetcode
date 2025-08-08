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

    public TreeNode findNext(TreeNode n1) {
        if (n1 == null || n1.right == null)
            return null;
        TreeNode curr = n1.right;
        while (curr.left != null)
            curr = curr.left;
        return curr;
    }

    public TreeNode findNode(TreeNode n1, int x) {
        if(n1 == null)
            return null;
        if(n1.val == x)
            return n1;
        if(n1.val>x)
            return findNode(n1.left, x);
        if(n1.val<x)
            return findNode(n1.right, x);
        return null;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            TreeNode successor = findNext(root);
            root.val = successor.val; 
            root.right = deleteNode(root.right, successor.val);
        }
        return root;
    }
}