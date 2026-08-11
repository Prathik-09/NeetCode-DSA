class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            int sum = 0;

            // Find sum of squares of digits
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            // Cycle detected
            if (set.contains(sum)) {
                return false;
            }

            set.add(sum);

            n = sum;
        }

        return true;
    }
}