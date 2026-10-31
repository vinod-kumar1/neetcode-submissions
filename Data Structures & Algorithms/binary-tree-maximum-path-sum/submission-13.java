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
    public int maxPathSum(TreeNode root) {
        int max[] = new int[] {root.val};
        trav(root , max);
return max[0];
    }

public int trav(TreeNode A, int[] max){
    if(A == null) return 0;

int left = trav(A.left , max);
int right = trav(A.right , max);

    int num = A.val;
    num = Math.max(num , A.val + left);
    num = Math.max(num , A.val + right);

if(Math.max(num , A.val + left + right) > max[0]) max[0] = Math.max(num , A.val + left + right);

    return num;
}

}
