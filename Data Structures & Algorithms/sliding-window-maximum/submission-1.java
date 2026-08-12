class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            //remove if the window exceeds
            if(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.removeFirst();
            }
            //remove from deques if the next number is max than previous stored
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.removeLast();
            }

            dq.addLast(i);
            // Once window reaches size k, get maximum
            if(i>=k-1){
                ans[index]=nums[dq.peekFirst()];
                index++;
            }

        }
        return ans;
    }
}
