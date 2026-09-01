class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            hm.putIfAbsent(nums[i], new ArrayList<>());
            hm.get(nums[i]).add(i);
        }

        int ans = Integer.MAX_VALUE;
        for(List<Integer> list : hm.values()) {
            for(int i = 0; i + 2 < list.size(); i++) {
                int first = list.get(i);
                int third = list.get(i + 2);

                int distance = 2 * (third - first);
                ans = Math.min(ans, distance);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}