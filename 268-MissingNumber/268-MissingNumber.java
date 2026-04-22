// Last updated: 4/22/2026, 9:08:37 PM
class Solution {
    public int missingNumber(int[] nums) {
        int XOR1 = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            XOR1 = XOR1 ^ nums[i];
        }
        int XOR2 = 0;
        for(int i = 1;i<=n;i++){
            XOR2 = XOR2 ^ i;
        }

        return XOR1^XOR2;

    }
}