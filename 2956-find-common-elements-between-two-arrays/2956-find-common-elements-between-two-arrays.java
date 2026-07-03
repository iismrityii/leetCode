public class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num : nums1) {
            s1.add(num);
        }

        for (int num : nums2) {
            s2.add(num);
        }

        int count1 = 0;
        for (int num : nums1) {
            if (s2.contains(num)) {
                count1++;
            }
        }

        int count2 = 0;
        for (int num : nums2) {
            if (s1.contains(num)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }
}