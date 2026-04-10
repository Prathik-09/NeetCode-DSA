class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int cs=1,ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]) continue;
            if(nums[i-1]+1==nums[i]){
                cs++;
            }
            else{
                ans=Math.max(ans,cs);
                cs=1;
            }
        }

        // final update
        ans = Math.max(ans, cs);

        return ans;
    }
}