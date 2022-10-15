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
    private int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        rec(root, low, high);
        return sum;
    }
    
    public void rec(TreeNode root, int low, int high) {
        if(root == null) return;
        rec(root.left, low, high);
        if(root.val >= low && root.val <= high) {
            sum += root.val;
        }
        rec(root.right, low, high);
    }
}