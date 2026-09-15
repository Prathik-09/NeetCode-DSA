class Solution {
    public int largestRectangleArea(int[] heights) {

        // int maxArea = 0;
        // int n = heights.length;

        // for (int i = 0; i < n; i++) {

        //     int current = heights[i];

        //     // Go left
        //     int left = i;

        //     while (left >= 0 && heights[left] >= current) {
        //         left--;
        //     }

        //     // Go right
        //     int right = i;

        //     while (right < n && heights[right] >= current) {
        //         right++;
        //     }

        //     // left and right are at the smaller bars
        //     int width = right - left - 1;

        //     int area = current * width;

        //     maxArea = Math.max(maxArea, area);
        // }

        // return maxArea;
       

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int currentHeight;

            if (i == heights.length) {
                currentHeight = 0;
            } else {
                currentHeight = heights[i];
            }

            while (!st.isEmpty() && heights[st.peek()] > currentHeight) {

                int height = heights[st.pop()];

                int right = i;

                int left;
                if (st.isEmpty()) {
                    left = -1;
                } else {
                    left = st.peek();
                }

                int width = right - left - 1;

                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            st.push(i);
        }

        return maxArea;
    
    }
}