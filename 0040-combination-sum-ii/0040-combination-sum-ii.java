class Solution {
    private void solve(int start, int currSum, List<Integer> temp, int tar, List<List<Integer>> ans, int candidates[]) {
        if(currSum > tar) {
            return;
        }

        if(currSum == tar) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
                temp.add(candidates[i]);
                solve(i + 1, currSum + candidates[i], temp, tar, ans, candidates);
                temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, 0, new ArrayList<>(), target, ans, candidates);
        return ans;
    }
}