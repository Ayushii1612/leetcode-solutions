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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null){
            return out;
        }

        stack.add(root);  //start with the root

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();  //take the top node
            out.add(node.val);  //this is Root

            if(node.right != null){
                stack.add(node.right);  //push right first
            }

            if(node.left != null){
                stack.add(node.left);  //push left last
            }
        }

        return out;
    }
}