class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sum = 0;
        List<Character> res = new ArrayList<>();

        for(int i=0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(res.contains(ch)){
                res = res.subList(res.indexOf(ch) + 1 , res.size());
            }
        res.add(ch);
if(res.size() > sum) sum = res.size();
        }
        return sum;
    }
}
