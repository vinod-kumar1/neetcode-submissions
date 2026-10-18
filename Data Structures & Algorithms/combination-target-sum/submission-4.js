class Solution {
    combinationSum(nums, target) {
        let res = [];
        // Optional: Sorting helps with "early exit" pruning
        nums.sort((a, b) => a - b);

        function backtrack(index, currentPath, currentSum) {
            if (currentSum === target) {
                res.push([...currentPath]);
                return;
            }

            for (let i = index; i < nums.length; i++) {
                // Efficiency: If this number pushes us over, 
                // and the array is sorted, all numbers after it will too.
                if (currentSum + nums[i] > target) break;

                currentPath.push(nums[i]);
                
                // Note: We pass 'i' as the next starting index, NOT 'i + 1'.
                // This is what allows for the reuse of the same number.
                backtrack(i, currentPath, currentSum + nums[i]);
                
                // Backtrack: Remove the number so we can try the next 'i' in the loop
                currentPath.pop();
            }
        }

        backtrack(0, [], 0);
        return res;
    }
}