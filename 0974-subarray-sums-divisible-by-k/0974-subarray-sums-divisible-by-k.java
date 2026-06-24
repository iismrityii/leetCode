class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int count = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = sum % k;
            if(mod < 0) {
                mod += k;
            }

            if(hm.containsKey(mod)) {
                count += hm.get(mod);
            }

            hm.put(mod, hm.getOrDefault(mod, 0) + 1);
        }

        return count;
    }
}