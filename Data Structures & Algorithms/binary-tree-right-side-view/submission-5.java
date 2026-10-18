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
    public List<Integer> rightSideView(TreeNode root) {
     ArrayList<Integer> res = new ArrayList<>();
         trav(root , 0, new int[] {-1}, res);
    return res;
    }

public void trav(TreeNode A , int cur, int[] max, ArrayList<Integer> res){
if(A == null) return;

if(cur > max[0]){
    max[0] = cur;
    res.add(A.val);
}
    trav(A.right , cur + 1, max, res);
    trav(A.left , cur + 1, max, res);
}

}
