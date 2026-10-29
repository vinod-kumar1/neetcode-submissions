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
    int max = -1;

    public List<Integer> rightSideView(TreeNode root) {
        TreeNode cur = root;
        List<Integer> res = new ArrayList<>();
        trav(root , res , 0);
return res;
    }

public void trav(TreeNode A , List<Integer> res ,int cur){
    if(A == null) return;

if(cur > max){
    res.add(A.val);
    max = Math.max(max , cur);
}

trav(A.right , res , cur + 1);
trav(A.left , res , cur + 1);

}

}
