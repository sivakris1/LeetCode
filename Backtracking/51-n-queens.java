class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        boolean[][] board = new boolean[n][n];

        List<List<String>> result = new ArrayList<>();

         queens(board, 0, result);

         return result;
    }

    public int queens(boolean[][] board, int row, List<List<String>> result){
        if(row == board.length){
            List<String> sol = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<board.length;j++){
                    sb.append(board[i][j] ? 'Q' : '.');
                }
                sol.add(sb.toString());
            }
            result.add(sol);
        }

        int count = 0;

        for(int col=0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1, result);
                board[row][col] = false;
            }
        }

        return count;
    }

    public boolean isSafe(boolean[][] board, int row, int col){
        
        for(int i=0;i<row;i++){
            //checks vertical
            if(board[i][col]){
                return false;
            }
        }
        

            //left diagonal
            int maxLeft = Math.min(row,col);
            for(int i=1 ;i<=maxLeft; i++){
                if(board[row-i][col-i]){
                    return false;
                }
            }

            //right diagonal
            int maxRight = Math.min(row, board.length-col-1);
            for(int i=1; i<=maxRight; i++){
                if(board[row-i][col+i]){
                    return false;
                }
            }

            return true;
        }
    }

    