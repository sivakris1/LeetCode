class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        if(mat.length == 1){
            return mat[0][0];
        }

        //this loop represents primary diagonal
        for(int i=0;i<mat.length;i++){
            sum += mat[i][i];
        }
        int len = mat.length;
        //this loop represents secondary diagonal
        for(int i=0;i<mat.length;i++){
            //only matrics with odd will enter into this statement and skips the common value in both diagonals
            if(i == len-1){
                len--;
                continue;
            }
            sum += mat[i][len-1];
            len--;
        }
        return sum;
    }
}