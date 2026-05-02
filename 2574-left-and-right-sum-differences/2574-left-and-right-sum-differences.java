class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        int prefix[] = new int[n];
        prefix[0] = nums[0];

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        } 

        for(int i = 0; i < n; i++) {
            leftSum[i] = (i > 0) ? prefix[i - 1] : 0;
            rightSum[i] = prefix[n - 1] - prefix[i];
        }

        for(int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}