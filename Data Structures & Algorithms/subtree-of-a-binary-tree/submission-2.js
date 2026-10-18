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
     * @param {TreeNode} subRoot
     * @return {boolean}
     */
    isSubtree(root, subRoot) {
let st = []
        function findRoot(node){
if(!node) return;
if(node.val == subRoot.val){
    st.push(node);
}
findRoot(node.left);
findRoot(node.right);
        }
        findRoot(root);
if(!st.length) return false;

function isSame(n1, n2){
if(!n1 && !n2) return true;

if(n1?.val != n2?.val) return false;

return isSame(n1.left , n2.left) && isSame(n1.right , n2.right);
}
return st.some(x => isSame(subRoot , x))
}
}
