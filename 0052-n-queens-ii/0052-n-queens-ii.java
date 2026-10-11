class Solution {
    int count = 0;int n;
    
    public boolean isSafe(boolean[][] chess , int row , int col){
        //top
        for(int i=row; i >= 0; i--){
            if(chess[i][col]){
                return false;
            }
        }
        // top left
        for(int i=row, j=col; j>=0 && i >= 0; i--, j--){
            if(chess[i][j]){
                return false;
            }
        }
        // top right
        for(int i=row, j=col; j<n && i>=0; i--, j++){
            if(chess[i][j]){
                return false;
            }
        }
        return true;
    } 
    
    public void solve(boolean[][] chess , int row){
        //base case
        if(row == n){
            count++; return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(chess , row , col)){
            chess[row][col] =  true;
            solve(chess , row+1);
            chess[row][col] = false; //backtracking step
            
            }
        }
    }

    

    public int totalNQueens(int n) {
        this.n = n;
        boolean[][] chess = new boolean[n][n];
        //starting with row 0
        solve(chess , 0);
        return count;
    }
}