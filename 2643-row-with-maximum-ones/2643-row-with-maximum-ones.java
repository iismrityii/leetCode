class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int oneCount = Integer.MIN_VALUE;
        int idx = 0;

        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }

            if(count > oneCount){
                oneCount = count;
                idx = i;
            }
        }
        
        return new int[]{idx, oneCount};
    }
}