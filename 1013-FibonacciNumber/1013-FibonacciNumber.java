// Last updated: 4/22/2026, 9:08:27 PM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;

        return fib(n-1) + fib(n-2);
    }
}