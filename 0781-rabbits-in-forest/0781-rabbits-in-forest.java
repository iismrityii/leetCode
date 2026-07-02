class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : answers) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int t = 0;
        for(int ans : hm.keySet()) {
            int freq = hm.get(ans);
            int groupSize = ans + 1;
            int grps = (int)Math.ceil((double)(freq) / groupSize);

            t += grps * groupSize;
        }

        return t;
    }
}