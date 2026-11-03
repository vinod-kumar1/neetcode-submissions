class Solution {
    public List<String> letterCombinations(String digits) {
      List<String> res = new ArrayList<>();
if(digits.length() == 0) return res;
     HashMap<Character, String> map = new HashMap<>();
     map.put('2' , "abc");   
     map.put('3' , "def");   
     map.put('4' , "ghi");   
     map.put('5' , "jkl");   
     map.put('6' , "mno");   
     map.put('7' , "pqrs");   
     map.put('8' , "tuv");   
     map.put('9' , "wxyz");

trav(digits, 0, new StringBuilder(), map, res, 0);
      return res;
    }
    
public void trav(String s,int k, StringBuilder str , HashMap<Character, String> map, List<String> res, int idx){

if(k >= s.length()){
    res.add(str.toString());
    return;
}


 for(int j = 0; j < map.get(s.charAt(k)).length() ; j++){
  str.append(map.get(s.charAt(k)).charAt(j));
  trav(s , k + 1 , str , map , res, idx + 1);
  str.deleteCharAt(str.length() - 1);
 }


}

}
