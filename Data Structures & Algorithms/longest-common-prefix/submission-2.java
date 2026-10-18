class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String cur = strs[0];

        for(int i = 1; i < strs.length; i++){
            String temp = strs[i];
            StringBuilder temp2 = new StringBuilder();
            for(int j = 0; j < Math.min(cur.length() , temp.length()); j++){
                if(cur.charAt(j) != temp.charAt(j)) break;
                temp2.append(cur.charAt(j));
            }
            cur = temp2.toString();
            if(cur.length() == 0) return "";
        }

        return cur;
    }
}