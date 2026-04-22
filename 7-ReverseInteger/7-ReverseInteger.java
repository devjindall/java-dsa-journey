// Last updated: 4/22/2026, 9:09:03 PM
class Solution {
    public int reverse(int x) {

        long num = x;
        if (x < 0)
            num = -num;
        long ans = 0;
        while (num > 0) {
            long digit = num % 10;
            ans = ans * 10 + digit;

            num /= 10;
        }
        if (ans > Integer.MAX_VALUE - 1) {
            return 0;
        }
        if (x < 0) {
            ans = -1 * ans;
        }

        return (int) ans;

        

    }
}