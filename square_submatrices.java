class Solution {
    public int countSquares(int[][] matrix) {
        int rows=matrix.length,cols=matrix[0].length,result=0;
        if(rows==0||cols==0){return 0;}
        int[][] dp=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0||j==0){
                    if(matrix[i][j]==0){dp[i][j]=0;}
                    else{dp[i][j]=1;}
                }
                else{
                    if(matrix[i][j]==0){dp[i][j]=0;}
                    else{
                        dp[i][j]=1+(Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]));
                    }
                }
                result+=dp[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(dp[i][j]);
            }
        }
        return result;
    }
}