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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
int n = p.val;
int m = q.val;

      if( n > m){
        int temp = n;
        n = m;
        m = temp;
      }

return trav(root , n, m);

}

public TreeNode trav(TreeNode root , int p, int q){
    if(q < root.val) return trav(root.left , p, q);
else if(p > root.val) return trav(root.right , p,q);
return root;
}


}
