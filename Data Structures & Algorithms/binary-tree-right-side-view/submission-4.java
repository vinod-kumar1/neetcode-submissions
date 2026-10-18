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
ArrayList<Integer> res = new ArrayList<>();
int lvl = 0;

    public void findInt(TreeNode node , int l){
if(node != null){

if(l > lvl){
    res.add(node.val);
    lvl = l;
}

findInt(node.right , l+1);
findInt(node.left , l+1);
}
    }


    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return res;
        findInt(root, 1);
    return res;
    }
}
