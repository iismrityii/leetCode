class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        Queue<int[]> q = new LinkedList<>();
        int directions[][] = {
            {0, -1},
            {-1, 0},
            {1, 0},
            {0, 1}
        };

        int oldColor = image[sr][sc];
        if(oldColor == color) {
            return image;
        }
        
        image[sr][sc] = color;

        q.offer(new int[]{sr, sc});

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int curr[] = q.poll();

                int row = curr[0];
                int col = curr[1];

                for(int dir[] : directions) {
                    int x = row + dir[0];
                    int y = col + dir[1];

                    if(x >= 0 && x < m && y >= 0 && y < n && image[x][y] == oldColor) {
                        image[x][y] = color;
                        q.offer(new int[]{x, y});
                    }
                }
            }
        }

        return image;
    }
}