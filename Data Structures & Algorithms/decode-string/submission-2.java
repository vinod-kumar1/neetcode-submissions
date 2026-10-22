class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == ']'){
                StringBuilder temp = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '[') temp.append(st.pop());
                st.pop();
                String num = "";

                for(int j = 0; j <= 2; j++){
                   if(!st.isEmpty()){
                    try{
                        int n = Integer.parseInt(st.peek() + "");
                        num = st.pop() + num;
                    }
                    catch(NumberFormatException err){
                      break;
                    }
                   }
                   else break;
                }

                int count = Integer.valueOf(num);
                int len2 = temp.length();

                for(int i = 0; i < count; i++){
                 for(int j = len2 - 1; j >= 0; j--) st.push(temp.charAt(j));
                }

               
            }
            else st.push(c);
        }

int len = st.size();

char[] res = new char[len];
len--;
while(!st.isEmpty()) res[len--] = st.pop();


return new String(res);
    }
}