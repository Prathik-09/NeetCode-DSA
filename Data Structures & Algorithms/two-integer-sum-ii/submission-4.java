class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[]=new int[2];
        int l=0,r=arr.length-1;
        int s=0;
        while(l<=r){
            s=arr[l]+arr[r];
            if(s==target){
                ans[0]=l+1;
                ans[1]=r+1;
                break;
            }
            else if(s>target){
                s-=arr[r];
                r--;
            }
            else{
                s-=arr[l];
                l++;
            }
        }
        return ans;
    }
}
