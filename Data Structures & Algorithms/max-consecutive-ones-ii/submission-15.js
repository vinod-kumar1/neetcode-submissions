class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums) {
        let longestSequence = 0;
        let left = 0;
        let right = 0;
        let numZeroes = 0;

        // While our window is in bounds
        while (right < nums.length) {

            // Increase numZeroes if the rightmost element is 0
            if (nums[right] === 0) {
                numZeroes++;
            }

            //If our window is invalid, contract our window
            while (numZeroes === 2) {
                if (nums[left] === 0) {
                    numZeroes--;
                }
                left++;
            }

            // Update our longest sequence answer
            longestSequence = Math.max(longestSequence, right - left + 1);

            // Expand our window
            right++;
        }

        return longestSequence;
    }
}