// Last updated: 4/22/2026, 9:08:18 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos1 = 0;
        int neg1=1;
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
            if(nums[i] >= 0){
                ans[pos1] = nums[i];
                pos1 +=2;
            }
            else{
               ans[neg1] = nums[i];
                neg1+=2;
            }
        }
        return ans;
    }

}