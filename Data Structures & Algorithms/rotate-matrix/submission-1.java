class Solution {
    public void rotate(int[][] arr) {
        // int m=arr.length;
        // int[][] temp=new int[m][m];

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<m;j++){
        //         temp[j][m-i-1]=arr[i][j];
        //     }
        // }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<m;j++){
        //         arr[i][j]=temp[i][j];
        //     }
        // }

        // Appproch 2:
        int n=arr.length;
         // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse every row

        for(int i=0;i<n;i++){
            int left = 0;
            int right = n - 1;

            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }



    }
}
