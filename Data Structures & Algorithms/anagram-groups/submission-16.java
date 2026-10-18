class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , ArrayList<String>> res = new HashMap<String , ArrayList<String>>();

        for(String str : strs){
            int[] arr = new int[26];
            for(char s : str.toCharArray()){
                arr[s - 'a']++;
            }
            res.putIfAbsent(Arrays.toString(arr) , new ArrayList<String>());
            res.get(Arrays.toString(arr)).add(str);
        }
        return new ArrayList<List<String>>(res.values());
    }
}
