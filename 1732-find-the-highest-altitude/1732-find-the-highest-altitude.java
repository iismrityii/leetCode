class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int alt[] = new int[n + 1];

        alt[0] = 0;
        alt[1] = gain[0];

        for(int i = 1; i < n; i++) {
            alt[i + 1] = alt[i] + gain[i];
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < alt.length; i++) {
            max = Math.max(alt[i], max);
        }

        return max;
    }
}