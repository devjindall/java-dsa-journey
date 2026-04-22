// Last updated: 4/22/2026, 9:08:17 PM
class Solution {
    public int mirrorDistance(int n) {
        int ans =  Math.abs(n-reverse(n));
        return ans;
    }

    public int reverse(int n){
        int digit = 0;
        int num = 0;
        while(n>0){
            digit = n%10;
            num = num * 10 + digit;
            n/=10;
        }
        return num;
    }
}