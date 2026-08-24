class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;

        for(int i = 0; i < n; i++) {
            if(hm.containsKey(nums[i] - k)) {
                ans += hm.get(nums[i] - k);
            }

            if(hm.containsKey(nums[i] + k)) {
                ans += hm.get(nums[i] + k);
            }

            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        return ans;
    }
}