class Solution {
    public int[] evenOddBit(int n) {
        int arr[] = new int[2];
        int even = 0;
        int odd = 0;

        for(int i = 0; i < 32; i++) {
            if((n & 1) == 1) {
                if(i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            n >>= 1;
        }

        arr[0] = even;
        arr[1] = odd;

        return arr;
    }
}