class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    private void solve(int i, int nums[], List<Integer> temp) {
        int n = nums.length;
        if(i == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);  
        solve(i + 1, nums, temp);
        temp.remove(temp.size() - 1);

        int idx = i + 1;
        while(idx < n && nums[idx] == nums[idx-1]) {
            idx++;
        }

        solve(idx, nums, temp);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        solve(0, nums, temp);
        return ans; 
    }
}