//https://leetcode-cn.com/leetbook/read/array-and-string/ciekh/
//零矩阵
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for(int i = 0 ; i < matrix.length;i++){
            //查找0
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]||column[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}