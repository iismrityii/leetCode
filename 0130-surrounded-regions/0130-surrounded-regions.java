class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < m; i++) {
            if(board[i][0] == 'O') {
                board[i][0] = '#';
                q.offer(new int[]{i, 0});
            }

            if(board[i][n - 1] == 'O') {
                board[i][n - 1] = '#';
                q.offer(new int[]{i, n - 1});
            }
        }

        for(int j = 0; j < n; j++) {
            if(board[0][j] == 'O') {
                board[0][j] = '#';
                q.offer(new int[]{0, j});
            }

            if(board[m - 1][j] == 'O') {
                board[m - 1][j] = '#';
                q.offer(new int[]{m - 1, j});
            }
        }

        int directions[][] = {
            {-1, 0},
            {0, -1},
            {1, 0},
            {0, 1}
        };

        while(!q.isEmpty()) {
            int curr[] = q.poll();
            int row = curr[0];
            int col = curr[1];

            for(int dir[] : directions) {
                int x = row + dir[0];
                int y = col + dir[1];

                if(x >= 0 && x < m && y >= 0 && y < n && board[x][y] == 'O') {
                    board[x][y] = '#';
                    q.offer(new int[]{x, y});
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {

                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}