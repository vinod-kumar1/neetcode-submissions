class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for(int i= 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '(') st.push(i);
            else if(c == ')'){
                if(!st.isEmpty()) st.pop();
                else if(!star.isEmpty()) star.pop();
                else return false;
            }
            else star.push(i);
        }

if(!st.isEmpty()){
    if(star.isEmpty()) return false;

    while(!st.isEmpty() && !star.isEmpty()){
        if(st.pop() > star.pop()) return false;
    }
}


return st.isEmpty();
    }
}
