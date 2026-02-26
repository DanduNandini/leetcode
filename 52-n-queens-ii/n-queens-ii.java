class Solution {
    public int totalNQueens(int n) {
        // Initialize empty board
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        
        return backtrack(n, board, 0);
    }

    public int backtrack(int n, char[][] board, int row){
        // If all queens are placed
        if(row == n){
            return 1;
        }

        int count = 0;

        for(int col = 0; col < n; col++){
            if(valid(board, row, col)){
                board[row][col] = 'Q';          // Place queen
                count += backtrack(n, board, row + 1);
                board[row][col] = '.';          // Backtrack
            }
        }

        return count;
    }

    public boolean valid(char[][] board, int row, int col){
        // Check same column
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // Check left diagonal (\)
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Check right diagonal (/)
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
}