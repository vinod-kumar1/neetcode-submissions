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

int[] temp = new int[] {Integer.MIN_VALUE , Integer.MAX_VALUE};

class Solution {
    public boolean isValidBST(TreeNode root) {
    boolean res[] = new boolean[] {true};
    trav(root, res);
    return res[0];    
    }

public int[] trav(TreeNode A, boolean[] res){
if(A == null) return temp;

int left[] = trav(A.left , res);
int right[] = trav(A.right , res);


if(A.val <= left[0] || A.val >= right[1]){
    res[0] = false;
    return temp;
}

int max = Math.max(A.val , Math.max(left[0] , right[0]));
int min = Math.min(A.val , Math.min(left[1] , right[1]));

return new int[] {max , min};

}

}
