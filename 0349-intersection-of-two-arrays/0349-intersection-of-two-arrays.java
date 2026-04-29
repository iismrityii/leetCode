class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums1) {
            hs.add(num);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums2) {
            if(hs.contains(num)) {
                set.add(num);
            }
        }

        int res[] = new int[set.size()];
        int i = 0;
        for(int num : set) {
                res[i++] = num;
        }

        return res;
    }
}