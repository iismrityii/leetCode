class Solution {
    private int reverse(int n) {
        int rev = 0;
        while(n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;      
        }

        return rev;
    }

    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        int arr[] = new int[2 * n];

        for(int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            int rev = reverse(nums[i]);
            arr[n + i] = rev;
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        return hs.size();
    }
}