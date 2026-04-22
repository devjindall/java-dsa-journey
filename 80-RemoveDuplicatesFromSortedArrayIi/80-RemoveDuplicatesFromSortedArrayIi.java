// Last updated: 4/22/2026, 9:08:48 PM
class Solution {
    public int removeDuplicates(int[] nums) {

int k = 2;
for(int i = 2;i<nums.length;i++){
    if(nums[i] != nums[k-2]){
        nums[k] = nums[i];
        k++;
    }
}
return k;
    }
}