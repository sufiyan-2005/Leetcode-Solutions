class Solution {
    int count = 0; int n;

    public boolean isSafe(boolean[][] chess, int row , int col){
        //top
        for(int i=row; i >= 0; i--){
            if(chess[i][col])return false;
        }
        //top left
        for(int i=row , j=col; i >= 0 && j >= 0; i-- , j--){
            if(chess[i][j])return false;
        }
        //top right
        for(int i=row , j=col; i >= 0 && j< n; i-- , j++){
            if(chess[i][j])return false;
        }
        return true;
    }

    public void solve(boolean[][] chess, int row){
        if(row == n){
            count++; return;
        }
        for(int col=0; col<n; col++){
            if(!isSafe(chess , row , col)) continue;
            chess[row][col] = true;
            solve(chess , row + 1);
            chess[row][col] = false;    //backtracking
        }
    }

    public int totalNQueens(int n) {
        this.n = n;
      boolean[][] chess = new boolean[n][n]; 
      solve(chess , 0);
      return count;
    }
}