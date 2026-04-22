// Last updated: 4/22/2026, 9:08:14 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
        }

        int ans = sum%k;
        return ans;
    }
}