class Solution {
    private int factors(int n) {
        int sum = 0;
        int count = 0;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                int j = n / i;

                if(i == j || count == 1) return 0;

                sum += i + j;
                count++;
            }
        }

        if(count == 0) return 0;
        return 1 + n + sum;
    }

    public int sumFourDivisors(int[] nums) {
        int sum = 0;

        for(int num : nums) {
            sum += factors(num);
        }

        return sum;
    }
}