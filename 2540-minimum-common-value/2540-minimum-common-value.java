class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums1) {
            hs.add(num);
        }

        for(int i = 0; i < nums2.length; i++) {
            if(hs.contains(nums2[i])) {
                min = Math.min(min, nums2[i]);
            }
        }
        
        if(min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }
}