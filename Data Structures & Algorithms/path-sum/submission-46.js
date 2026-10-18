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
        if(!root) return false;
        let st =[[targetSum, root]];

        while(st.length > 0){
            let temp = [];
            for(let [s , node] of st){
                if(node){

if(s - node.val == 0 && node.left == null && node.right == null) return true;
temp.push([s - node.val , node.left]);
temp.push([s - node.val , node.right]);
                }
            }
            st = temp;
        }
    return false;
    }
}
