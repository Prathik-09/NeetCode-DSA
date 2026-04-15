class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxi=Integer.MIN_VALUE;
        
        while(l<r){
            int h=Math.min(heights[l],heights[r]);
            int w=r-l;
            maxi=Math.max(h*w,maxi);

            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxi;
    }
}
