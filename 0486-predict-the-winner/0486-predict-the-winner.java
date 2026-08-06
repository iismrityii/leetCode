class Solution {
    private int solve(int nums[], int i, int j) {
        if(i == j) {
            return nums[i];
        }

        int left = nums[i] - solve(nums, i + 1, j);
        int right = nums[j] - solve(nums, i, j - 1);

        return Math.max(left, right);
    }

    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int diff = solve(nums, 0, n - 1);

        if(diff >= 0) {
            return true;
        }

        return false;
    }
}