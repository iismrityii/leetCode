class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totSum = 0;

        for(int num : nums) {
            totSum += num;
        }

        int sum = n * (n + 1) / 2;

        return sum - totSum;
    }
}