class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String str : wordDict) set.add(str);

        trav(s , set , 0, 0 , new StringBuilder() , res);

        return res;
    }

public void trav(String s, HashSet<String> map, int l, int r, StringBuilder sb, List<String> res){
if(r >= s.length()) return;

char c = s.charAt(r);
sb.append(c);

String temp = s.substring(l , r + 1);

if(map.contains(temp)){
    if(r + 1 == s.length()){
        res.add(sb.toString());
        return;
    }

    StringBuilder sb2 = new StringBuilder(sb);
    sb2.append(' ');
    trav(s , map , r + 1, r + 1, sb2 , res);
}

trav(s , map , l , r + 1, sb , res);

}

}