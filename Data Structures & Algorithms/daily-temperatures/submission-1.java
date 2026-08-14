class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];

        // for(int i=0;i<n;i++){
        //     int j=i+1;
        //     if(j<n && arr[i]<arr[j]){
        //         ans[i]=j-i;
        //     }
        //     else{
        //         while(j<n && arr[i]>=arr[j]){
        //             j++;
        //         }
        //         if(j==n){
        //             ans[i]=0;
        //         }
        //         else{
        //             ans[i]=j-i;
        //         }
        //     }
        // }

        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}
