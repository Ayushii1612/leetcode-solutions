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
    public TreeNode deleteNode(TreeNode root, int key) {

        TreeNode parent = null;
        TreeNode curr = root;

        // Search for the node that we want to delete
        while (curr != null && curr.val != key) {

            parent = curr;

            if (key < curr.val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        // CASE 1: Key is not found
        if (curr == null) {
            return root;
        }

        // CASE 4: Current node has TWO children
        if (curr.left != null && curr.right != null) {
            TreeNode successor = curr.right;
            TreeNode successorParent = curr;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }
            curr.val = successor.val;
            curr = successor;
            parent = successorParent;
        }

        // CASE 2: Current node is a LEAF NODE (no children)
        if (curr.left == null && curr.right == null) {
            if (parent == null) {
                return null;
            }
            if (curr == parent.right) {
                parent.right = null;
            } else {
                parent.left = null;
            }
        }

        // CASE 3: Current node has ONLY ONE CHILD
        else if (curr.left != null || curr.right != null) {
            TreeNode child = (curr.left != null)
                             ? curr.left : curr.right;
            if (parent == null) {
                return child;
            }
            if (curr == parent.right) {
                parent.right = child;
            } else {
                parent.left = child;
            }
        }
        return root;
    }
}
