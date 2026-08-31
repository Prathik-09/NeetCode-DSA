class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String s = conB(i);
            ans[i] = counts(s);
        }
        return ans;
    }
    private String conB(int i) {
        StringBuilder sb = new StringBuilder();

        while (i > 0) {
            sb.append(i % 2);
            i = i / 2;
        }

        String binary = sb.reverse().toString();
        return binary;
    }
    private int counts(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
