class Solution {
    longestPalindrome(s) {
        if (s.length < 1) return "";
        let start = 0;
        let end = 0;

        for (let i = 0; i < s.length; i++) {
            // Case 1: Odd length palindromes (center is i)
            let len1 = this.expandFromCenter(s, i, i);
            // Case 2: Even length palindromes (center is between i and i+1)
            let len2 = this.expandFromCenter(s, i, i + 1);
            
            let maxLen = Math.max(len1, len2);

            if (maxLen > end - start) {
                // Update pointers based on the center i and the found length
                start = i - Math.floor((maxLen - 1) / 2);
                end = i + Math.floor(maxLen / 2);
            }
        }

        return s.slice(start, end + 1);
    }

    expandFromCenter(s, left, right) {
        while (left >= 0 && right < s.length && s[left] === s[right]) {
            left--;
            right++;
        }
        // Returns the length of the palindrome found
        return right - left - 1;
    }
}