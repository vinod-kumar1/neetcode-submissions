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
    maxDepth(root) {
if(!root) return 0;
        let d = 1;
        let s = [root];
while(s.length > 0){
 let temp = [];
 for(let i=0; i < s.length; i++){
let r = s[i];
if(!r?.left && !r?.right) continue;
temp.push(r.left , r.right);
 }
if(temp.length > 0) d++;
s = temp;
}

return d;
    }
}
