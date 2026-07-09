class Solution {
    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void solve(int idx, List<List<Integer>> ans, int nums[]) {
        if(idx == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int num : nums) {
                list.add(num);
            }
            
            ans.add(list);
            return;
        }

        for(int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            solve(idx + 1, ans, nums);
            swap(nums, idx, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, ans, nums);
        return ans;
    }
}