class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st =new Stack<>();

        for(int n : asteroids){
            if(n < 0){
             
              while(!st.isEmpty() && st.peek() < Math.abs(n) && st.peek() > 0) st.pop();
            if(st.isEmpty()) st.push(n);
            else{
             if(st.peek() < 0){
                st.push(n);
                continue;
             }
                if(st.peek() == Math.abs(n)) st.pop();
            }
            }
            else st.push(n);
        }

int len = st.size();
int[] res = new int[len];

for(int i = 0; i < len; i++) res[len - 1 - i] = st.pop();


return res;
    }
}