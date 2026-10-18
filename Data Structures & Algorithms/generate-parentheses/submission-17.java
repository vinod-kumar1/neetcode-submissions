class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();
             trav(n , new StringBuilder() , res , 0, 0);
    return res;
    }

public void trav(int max, StringBuilder temp, List<String> res, int co, int cc){

if(co > max || cc > max || cc > co) return;
if(co == max && cc == max){
    res.add(temp.toString());
    return;
}

temp.append('(');
trav(max , temp , res , co + 1, cc);
temp.deleteCharAt(temp.length() - 1);

temp.append(')');
trav(max , temp , res , co, cc + 1);
temp.deleteCharAt(temp.length() - 1);

}

}
