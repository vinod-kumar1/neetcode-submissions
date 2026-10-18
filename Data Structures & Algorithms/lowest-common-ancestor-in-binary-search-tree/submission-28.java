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
ArrayList<TreeNode> map = new ArrayList<>();

//   public TreeNode findNode(TreeNode node , TreeNode p , TreeNode q){
//     if(node == null) return null;

//  if(ele.val < node.val) findNode(node.left , ele);
//  else if(ele.val > node.val) findNode(node.right , ele);
//  else {
//   map.add(node);
//   return node;
//   }

// if(map.contains(node)) return node;
// map.add(node);
// return node;
//   }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
if(root == null)   return null;

 if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left , p , q);
 else if(p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right , p , q);
  return root;
  }
}
