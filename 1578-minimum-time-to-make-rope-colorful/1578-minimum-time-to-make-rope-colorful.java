class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int time = 0;
        int i = 0;
        
        for(int j = 1; j < n; j++) {
            if(colors.charAt(i) == colors.charAt(j)) {
                time += Math.min(neededTime[i], neededTime[j]);

                if(neededTime[j] > neededTime[i]) {
                    i = j;
                }
            }
            else {
                i = j;
            }
        }

        return time;
    }
}