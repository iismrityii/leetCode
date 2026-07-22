class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;

        int req = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i - 1]) {
                req = nums[i - 1] + 1;
                ans += req - nums[i];
                nums[i] = req;
            }
        }

        return ans;
    }
}