
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] A, int target, int startIdx, int currentSum, List<Integer> current, List<List<Integer>> res) {
        // Base Case 1: Exceeded target
        if (currentSum > target) {
            return;
        }

        // Base Case 2: Target reached
        if (currentSum == target) {
            res.add(new ArrayList<>(current)); // Deep copy
            return;
        }

        // Explore choices starting from 'startIdx' (prevents permutations like [2,3] and [3,2])
        for (int i = startIdx; i < A.length; i++) {
            current.add(A[i]);
            
            // Pass 'i' (NOT 'i + 1') because we can reuse the same element A[i]
            backtrack(A, target, i, currentSum + A[i], current, res);
            
            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}