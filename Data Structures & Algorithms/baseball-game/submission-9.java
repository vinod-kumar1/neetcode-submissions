class Solution {
    public int calPoints(String[] operations) {
        HashSet<String> set = new HashSet<>();
        set.add("+");
        set.add("D");
        set.add("C");
   
    
    
    Stack<Integer> st = new Stack<>();

    for(String s : operations){
        if(set.contains(s)){
         switch(s){
            case "+":
            int n1 = st.pop();
            int n2 = st.pop();
            st.push(n2);
            st.push(n1);
            st.push(n1 + n2);
            break;

            case "D":
            int n3 = st.pop();
           int sum = n3 * 2;
            st.push(n3);
            st.push(sum);
            break;

            case "C":
            st.pop();
            break;
            
         }
        }
        else st.push(Integer.valueOf(s));
        
    }
 
 int sum = 0;

 while(!st.isEmpty()){
    sum += st.pop();
 }

 return sum;
    }
}