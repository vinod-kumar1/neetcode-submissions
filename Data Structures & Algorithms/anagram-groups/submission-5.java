class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
HashMap<String , ArrayList<String>> temp = new HashMap<String , ArrayList<String>>();

for(String str : strs){

char[] res = str.toCharArray();
Arrays.sort(res);
String sortedStr = new String(res);

if(temp.containsKey(sortedStr)) temp.get(sortedStr).add(str);
else temp.put(sortedStr , new ArrayList(List.of(str)));
}

var output = new ArrayList<List<String>>();
for(List l : temp.values()){
    output.add(l);
}
return output;
    }
}
