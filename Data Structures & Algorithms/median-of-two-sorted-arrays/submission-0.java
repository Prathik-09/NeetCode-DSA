class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=m+n;
        int[] arr=new int[k];
        int x=0;
        for(int i=0;i<n;i++){
            arr[x]=nums1[i];
            x++;
        }
        for(int j=0;j<m;j++){
            arr[x]=nums2[j];
            x++;
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }
        else{
            return ((double) arr[arr.length / 2]
                    + arr[arr.length / 2 - 1]) / 2;
        }
        
    }
}
