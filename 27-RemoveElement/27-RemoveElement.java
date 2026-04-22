// Last updated: 4/22/2026, 9:08:56 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}