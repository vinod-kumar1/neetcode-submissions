class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();

      trav(new StringBuilder() , res , 0 , 0, n);
    return res;
    }

public void trav(StringBuilder sb , List<String> res, int o, int c , int max){
    if(o > max || c > max) return;
    if(o == max && c == max){
        res.add(sb.toString());
        return;
    }

if(c > o) return;

    sb.append('(');
    trav(sb , res , o + 1 , c , max);
    
sb.deleteCharAt(sb.length()-1);

    sb.append(')');
    trav(sb , res , o , c + 1 , max);
    
sb.deleteCharAt(sb.length()-1);

}

}
