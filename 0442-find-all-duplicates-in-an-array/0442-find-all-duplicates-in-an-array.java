class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        List<Integer> ans = new ArrayList<>();
        for(int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(int key : hm.keySet()) {
            if(hm.get(key) == 2) {
                ans.add(key);
            }
        }

        return ans;
    }
}