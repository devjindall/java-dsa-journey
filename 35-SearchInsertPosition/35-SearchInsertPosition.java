// Last updated: 4/22/2026, 9:08:54 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if(target < nums[0]){
            return 0;
        }

        if(target > nums[n-1]){
            return n;
        }

        for(int i = 0;i<n;i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return 0;
    }
}