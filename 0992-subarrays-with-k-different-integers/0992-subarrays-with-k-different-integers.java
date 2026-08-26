class Solution {
    private int atMost(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int l = 0;
        int ans = 0;

        for(int r = 0; r < nums.length; r++) {
            hm.put(nums[r], hm.getOrDefault(nums[r], 0) + 1);
            while(hm.size() > k) {
                int leftNum = nums[l];
                hm.put(leftNum, hm.get(leftNum) - 1);
                if(hm.get(leftNum) == 0) {
                    hm.remove(leftNum);
                }
                
                l++;
            }

            ans += r - l + 1;
        }

        return ans;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
}