class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];

for(int i=1; i < strs.length; i++){
String s = strs[i];
String t = "";

for(int j=0; j < Math.min(temp.length() , s.length()); j++){
    if(s.charAt(j) == temp.charAt(j)) t += s.charAt(j);
    else break;
}
temp = t;
}
return temp;
    }
}