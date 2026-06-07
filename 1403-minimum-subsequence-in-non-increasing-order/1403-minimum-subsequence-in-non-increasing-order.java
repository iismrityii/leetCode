class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int total = 0;
        int sum = 0;

        Arrays.sort(nums);
        for(int num : nums) {
            total += num;
        }

        for(int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            arr.add(nums[i]);
            if(sum > total - sum) {
                break;
            }
        }

        return arr;
    }
}