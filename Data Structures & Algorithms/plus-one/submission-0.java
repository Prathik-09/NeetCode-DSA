class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int r=n-1;
        
        while(r>=0){
            if(digits[r]<9){
            digits[r]++;
            return digits;
        }
        digits[r]=0;

        r--;
        }
        int[] ans=new int[n+1];
        ans[0]=1;
        return ans;
    }
    
}
