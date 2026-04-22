// Last updated: 4/22/2026, 9:08:58 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

        // HashSet<Integer> hs = new HashSet<>();
        // for(int i = 0;i<nums.length;i++){
        //     hs.add(nums[i]);
        // }
        // int k = 0;
        // for(int x : hs){
        //     nums[k++] = x;
        // }
        // return k;
    }
}