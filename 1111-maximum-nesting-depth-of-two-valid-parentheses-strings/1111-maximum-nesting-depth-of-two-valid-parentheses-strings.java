class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        int currGrp = 1;

        for (int i = 0; i < n; i++) {
            char bkt = seq.charAt(i);

            if (bkt == '(') {
                ans[i] = 1 - currGrp;
            } else {
                ans[i] = currGrp;
            }

            currGrp ^= 1;
        }

        return ans;
    }
}