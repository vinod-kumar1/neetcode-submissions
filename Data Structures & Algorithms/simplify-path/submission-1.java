class Solution {
    public String simplifyPath(String path) {

Stack<String> st = new Stack<>();
String temp[] = path.split("/");

for(String s : temp){
    if(s.equals("..")) {
      if(!st.isEmpty()) st.pop();
    }
    else if(!s.equals("") && !s.equals(".")) st.push(s);
}

return "/" + String.join("/" , st);

    }
}