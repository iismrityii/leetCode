class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int l = 0;
        int r = 0;
        int ans = 0;

        while(r < n) {
            hm.put(nums[r], hm.getOrDefault(nums[r], 0) + 1);

            while(hm.get(nums[r]) > k) {
                hm.put(nums[l], hm.get(nums[l]) - 1);
                l++;
            }

            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans; 
    }
}