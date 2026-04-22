// Last updated: 4/22/2026, 9:08:38 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1)) == 0;
    }
}