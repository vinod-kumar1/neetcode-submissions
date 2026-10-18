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
     * @param {TreeNode} p
     * @param {TreeNode} q
     * @return {boolean}
     */
    isSameTree(p, q) {
        let same = true;
        function run(n1,n2){
if(!same) return;
if(!n1 && !n2) return;

if(n1?.val != n2?.val){
    same = false;
    return;
}

 run(n1.left , n2.left);
run(n1.right , n2.right);
if(!same) return;
}
        run(p,q);
return same;
    }
}
