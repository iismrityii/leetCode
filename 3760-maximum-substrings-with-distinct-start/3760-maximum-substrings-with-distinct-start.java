class Solution {
    public int maxDistinct(String s) {
        HashSet<Integer> hs = new HashSet<>();

        for(int num : s.toCharArray()) {
            hs.add(num);
        }

        return hs.size();
    }
}