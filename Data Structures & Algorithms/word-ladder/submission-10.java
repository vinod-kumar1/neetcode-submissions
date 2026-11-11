class Solution {
    int INF = 10000000;

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

Deque<String> dq = new ArrayDeque<>();
dq.addLast(beginWord);

HashSet<String> vis = new HashSet<>();
int hg = 0;

while(!dq.isEmpty()){
int len = dq.size();
hg++;

for(int i = 0; i < len; i++){
String s = dq.removeFirst();

 vis.add(s);
 if(s.equals(endWord)) return hg;

 for(String str : wordList){
    if(!vis.contains(str) && diff(s , str)) dq.addLast(str);
 }

}


}

return 0;
    }


public boolean diff(String A, String B){
    int count = 0;

    for(int i = 0; i < A.length(); i++){
       if(A.charAt(i) != B.charAt(i)) count++;
       if(count > 1) return false;
    }

    return true;
}

}
