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
     * @return {boolean}
     */
    isBalanced(root) {
        let temp = true;
        function run(node){
            if(!node) return 0;

            let l = run(node.left);
            let r = run(node.right);
if(Math.abs(l-r) > 1) {
    temp = false;
    return -1;
}
return Math.max(l,r)+1;
        }
        run(root);
        return temp;
    }
}
