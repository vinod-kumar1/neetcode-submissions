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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < inorder.length; i++) map.put(inorder[i] , i);
     return trav(preorder, inorder, new int[] {0}, 0, inorder.length-1, map);   
    }

public TreeNode trav(int[] po, int[] io, int[] idx, int l, int r, HashMap<Integer, Integer> map){

if(idx[0] >= io.length || l > r ) return null;

    int m = map.get(po[idx[0]]);
    TreeNode node = new TreeNode(po[idx[0]++]);    

node.left = trav(po, io, idx, l, m-1, map);
node.right = trav(po, io, idx, m + 1, r, map);

return node;

}

}
