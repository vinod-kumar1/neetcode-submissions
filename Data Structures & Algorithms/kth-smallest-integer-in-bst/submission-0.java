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

public void traverseTree(TreeNode node, ArrayList<Integer> arr){
  if(node != null){
    traverseTree(node.left , arr);
  arr.add(node.val);
    traverseTree(node.right , arr);
  }
}

    public int kthSmallest(TreeNode root, int k) {
    if(root == null) return 0;
    ArrayList<Integer> res = new ArrayList<>();
traverseTree(root, res);
    return res.get(k-1);
 
    }
}
