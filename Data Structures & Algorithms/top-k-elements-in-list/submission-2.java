class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        // count frequency
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] al=new ArrayList[nums.length+1];

       for(int i=0;i<=nums.length;i++){
            al[i]=new ArrayList<>();
       }

       for(int key:hm.keySet()){
        int freq=hm.get(key);
        al[freq].add(key);
       }
       int[] ans = new int[k];
        int idx = 0;

        for(int i = nums.length; i >= 0 && idx < k; i--){
            for(int num : al[i]){
                ans[idx++] = num;
                if(idx == k) break;
            }
        }

        return ans;
    }
}