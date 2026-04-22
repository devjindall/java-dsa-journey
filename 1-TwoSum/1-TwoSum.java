// Last updated: 4/22/2026, 9:09:05 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            int ans = target-nums[i];
            if(hm.containsKey(ans)){
                return new int[]{i,hm.get(ans)};
            }

            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}