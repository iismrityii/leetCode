class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        int currSum = 0;
        int l = 0;
        Set<Integer> hs = new HashSet<>();

        for(int r = 0; r < nums.length; r++) {
            while(hs.contains(nums[r])) {
                hs.remove(nums[l]);
                currSum -= nums[l];
                l++;
            }

            currSum += nums[r];
            hs.add(nums[r]);

            ans = Math.max(ans, currSum);
        }
       
        return ans;
    }
}