class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> res = new ArrayList<>();

        trav(digits , res , map, 0, new StringBuilder());
        return res;
    }

public void trav(String s, List<String> res, HashMap<Character, String> map , int i, StringBuilder str){

if(i >= s.length()){
  if(str.length() > 0)  res.add(str.toString());
    return;
}

for(char c : map.get(s.charAt(i)).toCharArray()){
    str.append(c);
    trav(s , res , map , i + 1, str);
    str.deleteCharAt(str.length() - 1);
}
 
}

}
