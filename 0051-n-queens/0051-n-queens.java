class Solution {
    private boolean isValid(int r, int c, char[][] board) {
        int n = board.length;
        for(int i = 0; i < r; i++) {
                if(board[i][c] == 'Q') {
                    return false;
                }
        }

        for(int i = r, j = c; i >= 0 && j >= 0 ; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = r, j = c; i >= 0 && j < n; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private void nQueens(int r, int n, List<List<String>> ans, char[][] board) {
        if(r == n) {
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < board.length; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        for(int c = 0; c < n; c++) {
            if(isValid(r, c, board)) {
                board[r][c] = 'Q';
                nQueens(r + 1, n, ans, board);
                board[r][c] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];

        for(int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }

        nQueens(0, n, ans, board);
        return ans;
    }
}