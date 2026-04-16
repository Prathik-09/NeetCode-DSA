class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1;
        int lm=0,rm=0;
        int t=0;
        while(l<=r){
            if(arr[l]<arr[r]){
                if(arr[l]>lm){
                    lm=arr[l];
                }
                else{
                    t+=lm-arr[l];
                }
                l++;
            }
            else{
                if(arr[r]>=rm){
                    rm=arr[r];
                }
                else{
                    t+=rm-arr[r];
                }
                r--;
            }
            
        }
        return t;

    }
}
