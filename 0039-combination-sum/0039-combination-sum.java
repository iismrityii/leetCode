class Solution {
    private void solve(int i, List<Integer> temp, List<List<Integer>> ans, int currSum, int tar, int candidates[]) {
        if(currSum > tar) {
            return;
        }

        if(currSum == tar) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(i == candidates.length) {
            return;
        }
        
        temp.add(candidates[i]);
        solve(i, temp, ans, currSum + candidates[i], tar, candidates);
        temp.remove(temp.size() - 1);
        solve(i + 1, temp, ans, currSum, tar, candidates);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, new ArrayList<>(), ans, 0, target, candidates);
        return ans;
    }
}