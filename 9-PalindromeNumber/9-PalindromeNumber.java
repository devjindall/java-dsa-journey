// Last updated: 4/22/2026, 9:09:00 PM
class Solution {
    public boolean isPalindrome(int x) {
        int num = reverse(x);
        if(num == x){
            return true;
        }
        return false;
    }

    public static int reverse(int n){
        int ans = 0;
        while(n>0){
            int digit = n%10;
            ans = ans*10+digit;
            n/=10;
        }

        return ans;
}
    }
    