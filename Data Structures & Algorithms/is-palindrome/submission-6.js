class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
s = s.split("").filter(
        (x) =>
          (x.charCodeAt() >= 65 && x.charCodeAt() <= 90) ||
          (x.charCodeAt() >= 97 && x.charCodeAt() <= 122) ||
          (x.charCodeAt() >= 48 && x.charCodeAt() <= 57)
      ).join("").toLowerCase();
return s == s.split("").reverse().join("");
    }
}
