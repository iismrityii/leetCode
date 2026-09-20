class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean vis[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        q.offer(source);
        vis[source] = true;

        while(!q.isEmpty()) {
            int curr = q.poll();
            if(curr == destination) {
                return true;
            }

            for(int x : adj.get(curr)) {
                if(!vis[x]) {
                    vis[x] = true;
                    q.offer(x);
                }
            }
        }

        return false;
    }
}