class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;

        for(int num : nums) {
            hs.add(num);
        }

        for(int num : nums) {
            if(hs.contains(num + diff) && hs.contains(num + 2 * diff)) {
                count++;
            }
        }

        return count;
    }
}