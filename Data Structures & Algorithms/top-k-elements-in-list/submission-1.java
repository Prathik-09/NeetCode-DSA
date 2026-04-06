class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        // count frequency
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // 🔥 convert to list
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hm.entrySet());

        // 🔥 sort by value
        Collections.sort(list, (a, b) -> a.getValue() - b.getValue());

        // 🔥 take last k elements
        int[] arr = new int[k];
        int index = 0;

        for(int i = list.size() - 1; i >= list.size() - k; i--){
            arr[index++] = list.get(i).getKey();
        }

        return arr;
    }
}