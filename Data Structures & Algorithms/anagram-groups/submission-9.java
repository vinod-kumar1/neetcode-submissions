class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
HashMap<String , List<String>> temp = new HashMap<String , List<String>>();

for(String str : strs){

char[] res = str.toCharArray();
Arrays.sort(res);
String sortedStr = new String(res);

if(!temp.containsKey(sortedStr)) temp.put(sortedStr , new ArrayList());
 temp.get(sortedStr).add(str);
}

return new ArrayList<List<String>>(temp.values());
   }
}