class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {
            int curr = nums[i] + 1;
            while(curr < nums[i + 1]) {
                ans.add(curr);
                curr++;
            }
        }

        return ans;
    }
}