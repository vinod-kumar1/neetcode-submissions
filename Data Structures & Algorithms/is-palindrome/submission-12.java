class Solution {
public boolean isAlphaNum(char r){
    return ('a' <= r && r <= 'z') || ('A' <= r && r <= 'Z') || (48 <= r && r <= 57);
    }

    public boolean isPalindrome(String s) {
     int l=0;

     for(int r=s.length()-1; r > l ; r--){
if(!isAlphaNum(s.charAt(l))){
    l++;
    r++;
    continue;
}
if(!isAlphaNum(s.charAt(r))) continue;
String t =("" + s.charAt(l)).toLowerCase();
String v =("" + s.charAt(r)).toLowerCase();

if(!t.equals(v)) return false;
l++;
     }   

     return true;
    }
}
