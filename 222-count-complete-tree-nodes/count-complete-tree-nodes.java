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
    public int countNodes(TreeNode root) {
      int leftht=leftheight(root);
      int rightht=rightheight(root);
      if(leftht==rightht){
        return (int)Math.pow(2,leftht)-1;
      }
      else{
        return 1+countNodes(root.left)+countNodes(root.right);
      }
    }
    public int leftheight(TreeNode root){
        int ht=0;
         while(root!=null){
            ht++;
            root=root.left;
         }
         return ht;
    }
    public int rightheight(TreeNode root){
        int ht=0;
        while(root!=null){
            ht++;
            root=root.right;
        }
        return ht;
    }
}