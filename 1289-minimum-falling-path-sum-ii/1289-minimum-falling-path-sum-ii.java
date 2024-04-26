class Solution {
    int n;
    public int minFallingPathSum(int[][] grid) {
    n=grid.length;
    int dp[][]=new int[n][n];
    for(int i=0;i<n;i++){
       Arrays.fill(dp[i],Integer.MAX_VALUE);
    } 
    int minVal=Integer.MAX_VALUE; 
    for(int col=0;col<n;col++){
        minVal=Math.min(minVal,minSum(grid,0,col,dp));
    }
    return minVal;
    }
    public int minSum(int[][] grid,int row, int col, int dp[][]){
       if(row==n-1){
        return dp[row][col]=grid[row][col];
       }
       if(dp[row][col]!=Integer.MAX_VALUE){
         return dp[row][col];
       }
       int minVal=Integer.MAX_VALUE; 
       for(int j=0;j<n;j++){
        if(j!=col){
            minVal=Math.min(minVal,minSum(grid,row+1,j,dp));
        }
       }
       return dp[row][col]=(grid[row][col]+minVal);
    }
}