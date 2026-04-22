// Last updated: 4/22/2026, 9:08:43 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            ans = ans^nums[i];
        }

        return ans;
    }
}