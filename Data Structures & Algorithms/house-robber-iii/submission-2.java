/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// RES -> [WithNode , WithoutNode];

class Solution {
    public int rob(TreeNode root) {
        HashMap<TreeNode , Integer> dp = new HashMap<>();
return trav(root, dp);
    }

public int trav(TreeNode A, HashMap<TreeNode, Integer> map){
if(A == null) return 0;
if(map.containsKey(A)) return map.get(A);

int res = A.val;

if(A.left != null) res += trav(A.left.left , map) + trav(A.left.right, map);
if(A.right != null) res += trav(A.right.left, map) + trav(A.right.right, map);
map.put(A , Math.max(trav(A.left, map) + trav(A.right, map) , res));

return map.get(A);
}

}