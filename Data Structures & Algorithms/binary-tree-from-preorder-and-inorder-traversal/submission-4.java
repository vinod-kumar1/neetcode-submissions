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
        int len = preorder.length;

        for(int i = 0; i < len; i++) map.put(inorder[i ] , i);
    
    return trav(preorder , inorder , map , 0 , len-1 , new int[] {0});
    }

public TreeNode trav(int PO[] , int[] IO, HashMap<Integer, Integer> map, int l , int r, int idx[]){
if(l > r || idx[0] >= PO.length) return null;

int num = PO[idx[0]++];
TreeNode node = new TreeNode(num);

node.left = trav(PO, IO, map , l , map.get(num) - 1 , idx);
node.right = trav(PO, IO, map , map.get(num) + 1 , r , idx);

return node;
}

}
