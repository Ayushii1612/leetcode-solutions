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

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> heights = new Stack<>();

        Stack<TreeNode> nodes = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode curr = stack.pop();
            nodes.push(curr);

            if (curr.left != null) {
                stack.push(curr.left);
            }

            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        
        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.pop();

            int leftHeight = 0;
            int rightHeight = 0;

            if (curr.left != null) {
                leftHeight = getHeight(curr.left);
            }

            if (curr.right != null) {
                rightHeight = getHeight(curr.right);
            }

            if (Math.abs(leftHeight - rightHeight) > 1) {
                return false;
            }
        }

        return true;
    }

    int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(
            getHeight(root.left),
            getHeight(root.right)
        );
    }
}