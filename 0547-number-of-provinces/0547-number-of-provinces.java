class Solution {
    private void dfs(int curr, int isConnected[][], boolean vis[]) {
        vis[curr] = true;
        for(int i = 0; i < isConnected.length; i++) {
            if(isConnected[curr][i] == 1 && !vis[i]) {
                dfs(i, isConnected, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean vis[] = new boolean[isConnected.length];

        for(int i = 0; i < isConnected.length; i++) {
            if(!vis[i]) {
                count++;
                dfs(i, isConnected, vis);
            }
        }

        return count;
    }
}