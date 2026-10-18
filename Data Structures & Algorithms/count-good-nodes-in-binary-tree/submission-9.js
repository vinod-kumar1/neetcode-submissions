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
    goodNodes(root) {
if(!root) return null;
    let count = 1;

    function run(node, max){
if(!node) return;
if(node.val >= max) {
    max = node.val;
    count+=1;
    }

run(node.left , Math.max(node.val , max));
run(node.right , Math.max(node.val , max));
}
    run(root.left , root.val);
    run(root.right , root.val);
    return count;
    }
}
