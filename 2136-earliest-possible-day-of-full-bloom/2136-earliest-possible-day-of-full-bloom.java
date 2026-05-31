class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;

        int flowers[][] = new int[n][2];
        for(int i = 0; i < n; i++) {
            flowers[i][0] = plantTime[i];
            flowers[i][1] = growTime[i];
        }

        Arrays.sort(flowers, (a, b) -> b[1] - a[1]);
        int maxBloomDays = 0;
        int prevPlantDays = 0;

        for(int i = 0; i < n; i++) {
            int currPlantTime = flowers[i][0];
            int currGrowTime = flowers[i][1];

            prevPlantDays += currPlantTime;
            int currBloomTime = prevPlantDays + currGrowTime;

            maxBloomDays = Math.max(maxBloomDays, currBloomTime);
        }

        return maxBloomDays;
    }
}