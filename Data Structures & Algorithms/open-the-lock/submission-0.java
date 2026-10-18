class Lock{
char[] cur;
int num;

Lock(char[] c, int n){
this.cur = c;
this.num = n;
}

}

class Solution {

    HashMap<Character, Character> next = new HashMap<>();
    HashMap<Character, Character> prev = new HashMap<>();


    public int openLock(String[] deadends, String target) {
        for(int i = 0; i < 9; i++) next.put((char) (i + '0') , (char) ((i + 1) + '0'));
        next.put('9' , '0');
        
        for(int i = 9; i >= 1; i--) prev.put((char) (i + '0') ,  (char) ((i - 1) + '0'));
        prev.put('0' , '9');
        
        HashSet<String> vis = new HashSet<>();
        for(String s : deadends) vis.add(s);

Deque<Lock> dq = new ArrayDeque<>();
dq.addLast(new Lock(new char[] {'0' , '0' , '0' , '0'} , 0));

int count = 0;
boolean found = false;

while(!dq.isEmpty()){
    Lock item = dq.removeFirst();
    char[] temp = item.cur;

    String str = new String(temp);

    if(str.equals(target)) return item.num;

    if(vis.contains(str)) continue;
    vis.add(str);

    for(int i = 0; i < 4; i++){
        char c = temp[i];
        
        char[] forwardTemp = Arrays.copyOf(temp , 4);
        forwardTemp[i] = next.get(c);
        dq.addLast(new Lock(forwardTemp , item.num + 1));

        char[] backwardTemp = Arrays.copyOf(temp , 4);
        backwardTemp[i] = prev.get(c);
        dq.addLast(new Lock(backwardTemp , item.num + 1));

    }
    count++;
}

        return -1;
    }

}