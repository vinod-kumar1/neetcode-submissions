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


public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ArrayList<String> res = new ArrayList<>();
        serHelper(root , res);    
        return String.join( "," , res);
    }

    public void serHelper(TreeNode A, ArrayList<String> res){
        if(A == null){
            res.add("N");
            return;
        }

       res.add(String.valueOf(A.val));
        serHelper(A.left , res);
        serHelper(A.right , res);    
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] temp = data.split(",");
        return desHelper(temp , new int[] {0});
    }

public TreeNode desHelper(String[] temp , int i[]){
    if(temp[i[0]].equals("N")) {
     i[0]++;
     return   null;
    }

TreeNode node = new TreeNode(Integer.parseInt(temp[i[0]]));
i[0]++;

node.left = desHelper(temp , i);
node.right = desHelper(temp , i);
return node;
}

}
