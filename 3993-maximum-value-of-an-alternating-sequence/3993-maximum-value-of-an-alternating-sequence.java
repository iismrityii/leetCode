class Solution {
    public long maximumValue(int n, int s, int m) {
        long ans = s;

        if(n == 1) {
            return ans;
        }

        long peaks = n / 2;
        ans += 1L * m * peaks;
        ans -= (peaks - 1);

        return ans;
    }
}