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
     * @return {number[]}
     */
    rightSideView(root) {
        if(!root) return [];
        let st = [root];
        let res = [root.val];

        while(st.length){
            let temp = [];
            for(let i=0; i < st.length;i++){
if(!st[i]) continue;
if(st[i]?.left) temp.push(st[i].left);
if(st[i]?.right) temp.push(st[i].right);
}
if(temp.length) res.push(temp.at(-1).val);
st = temp; 
}
return res;
}

}
