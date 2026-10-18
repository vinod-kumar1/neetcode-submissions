class Solution {
    /**
     * @param {number[]} digits
     * @return {number[]}
     */
    plusOne(digits) {
        return String(Number(digits.join(""))+1).split("").map(Number);
        }
}
