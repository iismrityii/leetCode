class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int directions[][] = {
            {0, -1},
            {-1, 0},
            {0, 1},
            {1, 0}
        };

        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        int min = 0;

        while(!q.isEmpty()) {
            int size = q.size();
            boolean rotten = false;
            
            for(int i = 0; i < size; i++) {
                int curr[] = q.poll();

                int row = curr[0];
                int col = curr[1];

                for(int dir[] : directions) {
                    int x = row + dir[0];
                    int y = col + dir[1];
                    if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        q.offer(new int[]{x, y});
                        rotten = true;
                    }
                }
            }

            if(rotten) {
                min++;
            }
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                if(grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return min;
    }
}