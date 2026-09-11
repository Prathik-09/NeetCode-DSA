class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }// Sort by position: closest to target first
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        double[] t = new double[n];

        for (int i = 0; i < n; i++) {
            double tta = (double)(target - cars[i][0]) / cars[i][1];
            t[i] = tta;
        }

        double maxi = 0;
        int fc = 0;

        for (int i = 0; i < n; i++) {
            if (t[i] > maxi) {
                fc++;
                maxi = t[i];
            }
        }

        return fc;
    }
}
