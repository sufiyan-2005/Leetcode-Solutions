class Solution {
    public int celebrity(int mat[][]) {
    //    int row = mat.length , col = mat[0].length;
    int n = mat.length;
    int left = 0;
    int right = n - 1;
    
    while(left < right){
        if(mat[left][right] == 1){
            left++;
        }else{
            right--;
        }
    }
    
    int candidate = left;
    
    for(int k=0; k<n; k++){
        if(k == candidate){
            continue;
        }
        if(mat[candidate][k] == 1|| mat[k][candidate] == 0){
            return -1;
        }
    }
    return candidate;
    }
}
