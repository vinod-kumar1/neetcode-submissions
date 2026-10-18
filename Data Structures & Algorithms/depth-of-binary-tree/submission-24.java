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

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        int d = 0;

while(!st.isEmpty()){
Stack<TreeNode> temp = new Stack<>();
while(!st.isEmpty()) {
    TreeNode n = st.pop();
   if(n.left != null) temp.push(n.left);
   if(n.right != null) temp.push(n.right);
}
while(!temp.isEmpty()) st.push(temp.pop());
d++;
}
return d;
    }
}
