class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int maxi=0;

       for(int pile:piles){
        maxi=Math.max(pile,maxi);
       } 

       int low=1,high=maxi,ans=maxi;
       
       while(low<=high){
        
        int mid=low+(high-low)/2;
        long hour=0;
        for(int pile:piles){
            hour+=(pile+mid-1)/mid;
        }
        if(hour<=h){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
}
