class Solution {
    private int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            int r = n % 10;
            sum += r;
            n = n / 10;
        }

        return sum;
    }

    public int minElement(int[] nums) {
        int j = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int s = sumOfDigits(nums[i]);
            nums[j++] = s;
        }

        for(int num : nums) {
            min = Math.min(num, min);
        }

        return min;
    }
}