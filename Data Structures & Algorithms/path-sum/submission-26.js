/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    /**
     * @param {TreeNode} root
     * @param {number} targetSum
     * @return {boolean}
     */
    hasPathSum(root, targetSum) {

        function dfs(node, sum){
if(!node?.left && !node?.right) return sum + node?.val == targetSum;


return dfs(node.left , sum + node.val) || dfs(node.right , sum+node.val);

        }
        return dfs(root , 0);
    }
}
