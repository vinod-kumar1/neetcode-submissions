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
     * @return {number}
     */
    diameterOfBinaryTree(root) {
        let res = 0;
function run(node){
    if(!node) return 0;
    let l = run(node.left);
    let r = run(node.right);
res = Math.max(res , l+r);

return 1 + Math.max(l,r);
}
run(root);
        return res;
    }
}
