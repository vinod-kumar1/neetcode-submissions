class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        trav(new StringBuilder() , res ,0 , 0, n);
        return res;
    }

public void trav(StringBuilder temp, List<String> res, int o, int c, int max){
if(c > o || o > max || c > max) return;

    if(o == max && c == max){
       res.add(temp.toString());
        return;
    }

    

temp.append('(');
trav(temp , res, o + 1, c, max);
temp.deleteCharAt(temp.length() - 1);

temp.append(')');
trav(temp , res, o, c + 1, max);
temp.deleteCharAt(temp.length() - 1);

}

}
