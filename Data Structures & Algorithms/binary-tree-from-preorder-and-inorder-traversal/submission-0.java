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
        HashMap<Integer , Integer> map = new HashMap<>();
        int preorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;

        for(int i=0; i < len; i++) map.put(inorder[i], i);
        
        return constructTree(preorder , 0 , len-1);
    }

public TreeNode constructTree(int[] po , int l , int r){
    if(l > r) return null;

int rv = po[preorderIndex++];
    TreeNode node = new TreeNode(rv);
    int mid = map.get(rv);

    node.left = constructTree(po ,l, mid-1);
    node.right = constructTree(po , mid + 1 , r);
return node;
}

}
