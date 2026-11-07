
class Node {
    char c;
    int freq;

    Node(char ch) {
        this.c = ch;
        this.freq = 0;
    }
}

class Solution {
    public String reorganizeString(String s) {

        int max = 0;

        HashMap<Character, Node> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(!map.containsKey(c))
                map.put(c, new Node(c));

            map.get(c).freq++;
            max = Math.max(max, map.get(c).freq);
        }

        if(max > (s.length() + 1) / 2) return "";

        PriorityQueue<Node> pq =
            new PriorityQueue<>((a, b) ->
                Integer.compare(b.freq, a.freq));

        for(Node node : map.values())
            pq.offer(node);

        StringBuilder res = new StringBuilder();

        Node prev = null;

        while(!pq.isEmpty()) {

            Node curr = pq.poll();

            res.append(curr.c);
            curr.freq--;

            if(prev != null && prev.freq > 0)
                pq.offer(prev);

            prev = curr;
        }

        return res.toString();
    }
}
