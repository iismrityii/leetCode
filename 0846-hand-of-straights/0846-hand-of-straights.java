class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> freq = new TreeMap<>();

        for (int x : hand) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        while (!freq.isEmpty()) {
            int first = freq.firstKey();

            for (int i = 0; i < groupSize; i++) {
                int card = first + i;
                if (!freq.containsKey(card)) {
                    return false;
                }

                freq.put(card, freq.get(card) - 1);

                if (freq.get(card) == 0) {
                    freq.remove(card);
                }
            }
        }

        return true;
    }
}