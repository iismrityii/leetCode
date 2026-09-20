class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[n];

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(!vis[i]) {
                count++;
                q.offer(i);
                vis[i] = true;
            
                while(!q.isEmpty()) {
                    int curr = q.poll();
                    for(int j = 0; j < n; j++) {
                        if(isConnected[curr][j] == 1 && !vis[j]) {
                            vis[j] = true;
                            q.offer(j);
                        }
                    }
                }
            }
        }

        return count;
    }
}