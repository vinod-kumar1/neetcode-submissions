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
if(!s[i]) continue;
let x = s[i];
if(x.left) temp.push(x.left);
if(x.right) temp.push(x.right);
}
if(temp.length > 0) d++;
s = temp;
}

return d;
    }
}
