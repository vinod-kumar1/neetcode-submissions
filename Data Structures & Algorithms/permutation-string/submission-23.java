class Solution {
   public boolean checkInclusion(String s1, String s2) {
    int[] count = new int[26];
    for (char c : s1.toCharArray()) count[c - 'a']++;

    int l = 0, r = 0, needed = s1.length();

    while (r < s2.length()) {
        // If the character at r is one we still need, decrease the 'needed' count
        if (count[s2.charAt(r) - 'a'] > 0) {
            needed--;
        }
        // Use up one instance of this character
        count[s2.charAt(r) - 'a']--;
        r++;

        // If we have satisfied all character needs, we found it
        if (needed == 0) return true;

        // If the window size equals s1.length, we must slide the left side
        if (r - l == s1.length()) {
            // If the character leaving was one of our required characters, increase 'needed'
            if (count[s2.charAt(l) - 'a'] >= 0) {
                needed++;
            }
            // Put the character back into our "available" count
            count[s2.charAt(l) - 'a']++;
            l++;
        }
    }
    return false;
}
}
