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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if(root == null) return res;
    
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.addLast(root);

while(!dq.isEmpty()){
ArrayList<Integer> temp = new ArrayList<>();
int len = dq.size();

for(int i=0; i < len; i++){
    TreeNode node = dq.removeFirst();
    temp.add(node.val);

    if(node.left != null) dq.add(node.left);
    if(node.right != null) dq.add(node.right);
}

res.add(temp);
}

return res;
    }
}
