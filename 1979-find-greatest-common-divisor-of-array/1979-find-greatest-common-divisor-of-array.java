class Solution {
    private static int solve(int a, int b) {
        if(a == 0) {
            return b;
        }

        if(b == 0) {
            return a;
        }

        if(a == b) {
            return a;
        }

        if(a > b) {
            return solve(a - b, b);
        }

        return solve(a, b - a);
    }

    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[n - 1];

        return solve(min, max);
    }
}