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
ArrayDeque<TreeNode> deq = new ArrayDeque<>();
        deq.add(root);

        while(!deq.isEmpty()){
            int len = deq.size();
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i=0; i < len; i++){
               TreeNode temp = deq.removeFirst();
               if(temp.left != null) deq.addLast(temp.left);
               if(temp.right != null) deq.addLast(temp.right);
            arr.add(temp.val);
            }

            res.add(arr);
        }
        return res;
    }
}
