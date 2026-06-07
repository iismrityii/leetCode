class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n < 2) {
            return 0;
        }

        Arrays.sort(nums);
        int maxDiff = 0;
        for(int i = 0; i < n - 1; i++) {
            int diff = nums[i + 1] - nums[i];
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}