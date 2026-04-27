class Solution {
    public long[] distance(int[] nums) {
        long res[] = new long[nums.length];
        Map<Integer, List<Integer>> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            hm.putIfAbsent(nums[i], new ArrayList<>());
            hm.get(nums[i]).add(i);
        }

        for(List<Integer> list : hm.values()) {
            int n = list.size();
            long prefix[] = new long[n];
            prefix[0] = list.get(0);

            for(int i = 1; i < n; i++) {
                prefix[i] = prefix[i-1] + list.get(i);
            }
            
            for(int i = 0; i < n; i++) {
                long left = 0, right = 0;
                int idx = list.get(i);
                if(i > 0) {
                    left = (long) list.get(i) * i - prefix[i - 1];
                }
                if(i < n - 1) {
                    right = (prefix[n - 1] - prefix[i]) - (long) list.get(i) * (n - i - 1);
                }  
                res[idx] = left + right;
            }
        }

        return res;
    }
}