class Solution {
    public int reverse(int x) {

        int y = 1;

        long num = x;

        if (num < 0) {
            num = -num;
            y = -1;
        }

        long rev = 0;

        while (num > 0) {
            long r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }

        rev = rev * y;

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}