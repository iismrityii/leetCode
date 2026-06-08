class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long ans = 0;
        int max = nums.get(0);
       
        for(int i = 1; i < nums.size(); i++) {
            ans += max;
            max = Math.max(max, nums.get(i));
        }

        return ans;
    }
}