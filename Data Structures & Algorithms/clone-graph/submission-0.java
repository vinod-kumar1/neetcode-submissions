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
        if(node == null) return null;

        Deque<Node> dq= new ArrayDeque<>();
        HashMap<Node, Node> map = new HashMap<>();
    
        map.put(node, new Node(node.val));
        dq.add(node);

        while(!dq.isEmpty()){
          Node temp = dq.removeFirst();

            for(Node nei : temp.neighbors){
             if(!map.containsKey(nei)) {
              map.put(nei , new Node(nei.val));
              dq.addLast(nei);
              }
        map.get(temp).neighbors.add(map.get(nei));
            
        }

        }

return map.get(node);
    }
}