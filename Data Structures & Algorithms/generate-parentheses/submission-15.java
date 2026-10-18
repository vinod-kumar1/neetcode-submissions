class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        dfs(res, temp, n, 0, 0);
        return res;
    }

    public void dfs(List<String> res, StringBuilder temp, int n, int op, int cc) {
        if (temp.length() == 2 * n) {
            res.add(temp.toString());
            return;
        }

if(op < n){
    temp.append("(");
    dfs(res , temp , n , op+1 , cc);
    temp.deleteCharAt(temp.length()-1);
}

if(cc < op){
        temp.append(")");
    dfs(res , temp , n , op , cc+1);
    temp.deleteCharAt(temp.length()-1);
}

    }
}
