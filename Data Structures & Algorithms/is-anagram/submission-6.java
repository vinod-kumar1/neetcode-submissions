class Solution {
    public boolean isAnagram(String s, String t) {
  HashMap<Character, Integer> src = new HashMap<Character, Integer>();
      for (int i = 0; i < s.length(); i++) {
        char temp = s.charAt(i);
        if (src.containsKey(temp))
          src.put(temp, src.get(temp) + 1);
        else {
          src.put(temp, 1);
        }
      }
      
      for (int i = 0; i < t.length(); i++) {
        char temp = t.charAt(i);
        if (!src.containsKey(temp) || src.get(temp) <= 0)
          return false;
        else {
          src.put(temp, src.get(temp) - 1);
          if (src.get(temp) <= 0)
            src.remove(temp);
        }
      }
      
      return src.size() <= 0;
    }
}
