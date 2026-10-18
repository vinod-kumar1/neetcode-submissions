class Solution {
        public static List<String> letterCombinations(String digits) {
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
        if (digits.length() == 0)
            return res;
        StringBuilder str = new StringBuilder();

        dfs(res, digits, map, 0, str);
        return res;

    }

    public static void dfs(List<String> res, String nums, HashMap<Character, String> map, int i, StringBuilder str) {
        
        if (i >= nums.length()) {
            res.add(str.toString());
            return;
        }
            for (char c : map.get(nums.charAt(i)).toCharArray()) {
                str.append(c);
                dfs(res, nums, map, i + 1, str);
                str.deleteCharAt(str.length() - 1);
            }
        
    }
}
