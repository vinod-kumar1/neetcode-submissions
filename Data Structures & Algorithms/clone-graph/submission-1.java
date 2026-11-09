/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
HashMap<Node , Node> vis = new HashMap<>();
return trav(node , vis);
    }

public Node trav(Node node , HashMap<Node, Node> vis){
    if(node == null) return null;

if(vis.containsKey(node)) return vis.get(node);

Node temp = new Node(node.val);
vis.put(node , temp);

for(Node neigh : node.neighbors){ 
Node temp2 = trav(neigh , vis);

vis.get(node).neighbors.add(temp2);

}


return vis.get(node);
}


}