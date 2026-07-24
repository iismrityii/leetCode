class Pair {
    int r;
    int c;

    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        int count = 0;

        Queue<Pair> q = new LinkedList<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !vis[i][j]) {
                    q.offer(new Pair(i, j));
                    vis[i][j] = true;
                    count++;
                }
                
                while(!q.isEmpty()) {
                    Pair curr = q.poll();

                    int r = curr.r;
                    int c = curr.c;

                    if(r >= 0 && r < m && c + 1 >= 0 && c + 1 < n && grid[r][c + 1] == '1' && !vis[r][c + 1]) {
                        vis[r][c + 1] = true;
                        q.offer(new Pair(r, c + 1));
                    }

                    if(r + 1 >= 0 && r + 1 < m && c >= 0 && c < n && grid[r + 1][c] == '1' && !vis[r + 1][c]) {
                        vis[r + 1][c] = true;
                        q.offer(new Pair(r + 1, c));
                    }

                    if(r >= 0 && r < m && c - 1 >= 0 && c - 1 < n && grid[r][c - 1] == '1' && !vis[r][c - 1]) {
                        vis[r][c - 1] = true;
                        q.offer(new Pair(r, c - 1));
                    }

                    if(r - 1 >= 0 && r - 1 < m && c >= 0 && c < n && grid[r - 1][c] == '1' && !vis[r - 1][c]) {
                        vis[r - 1][c] = true;
                        q.offer(new Pair(r - 1, c));
                    }
                }
            }
        }

        return count;
    }
}