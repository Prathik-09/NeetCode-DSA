class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<=target && matrix[i][matrix[i].length-1]>=target){
                    for(int k=0;k<matrix[i].length;k++){
                        if(matrix[i][k]==target){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
