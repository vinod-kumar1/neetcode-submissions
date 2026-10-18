class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(']' , '[');
        map.put(')' , '(');
        map.put('}' , '{');
    
    Stack<Character> st = new Stack<>();

    for(char c : s.toCharArray()){
     if(map.containsKey(c)){
        if(st.isEmpty() || st.peek() != map.get(c)) return false;
        else st.pop();
     }
     else st.push(c);
    }

    return st.isEmpty();
    }
}
