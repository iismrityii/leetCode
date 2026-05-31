class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        Arrays.sort(asteroids);

        long currMass = mass;
        for(int num : asteroids) {
            if(currMass >= num) {
                currMass += num;
            } else {
                return false;
            }
        }

        return true;
    }
}