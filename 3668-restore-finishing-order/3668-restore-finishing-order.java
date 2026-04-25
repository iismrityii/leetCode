class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> hs = new HashSet<>();
        int res[] = new int[friends.length];

        for(int id : friends) {
            hs.add(id);
        }

        int idx = 0;
        for(int i = 0; i < order.length; i++) {
            if(hs.contains(order[i])) {
                res[idx++] = order[i];
            }
        }

        return res;
    }
}