class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Deque<Integer> q = new ArrayDeque<>();
        boolean[] vis = new boolean[n];

        q.offer(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int x : rooms.get(curr)) {
                if (!vis[x]) {
                    q.offer(x);
                    vis[x] = true;
                }
            }
        }

        for (boolean x : vis) {
            if (!x) {
                return false;
            }
        }

        return true;
    }
}