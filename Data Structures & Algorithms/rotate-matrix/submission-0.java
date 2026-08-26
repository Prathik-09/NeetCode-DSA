class Solution {
    public void rotate(int[][] arr) {
        int m=arr.length;
        int[][] temp=new int[m][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                temp[j][m-i-1]=arr[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=temp[i][j];
            }
        }
    }
}
