class Solution {
    public boolean canJump(int[] nums) {
        int j = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(i > j) {
                return false;
            } else {
                j = Math.max(j, nums[i] + i);
            }
        }

        return true;
    }
}