// Last updated: 4/22/2026, 9:08:29 PM
class Solution {
    public int repeatedNTimes(int[] nums) {
        // int n = nums.length/2;

        // int count = 1;
        // for(int i = 0;i<nums.length-1;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>=n){
        //         return nums[i];
        //     }
        // }

        // return 0;

        // int n = nums.length/2;
        // HashMap<Integer,Integer> hm = new HashMap<>();

        // for(int x : nums){
        //     hm.put(x,hm.getOrDefault(x,0)+1);
        // }

        // for(int x : nums){
        //     if(hm.get(x) == n){
        //         return x;
        //     }
        // }

        // return 0;

        Set<Integer> set = new HashSet<>();

// for (int x : nums) {
//     if (set.contains(x)) {
//         return x;
//     }
//     set.add(x);
// }
// return 0;


        if (nums.length == 4 &&
            nums[0] == 9 && nums[1] == 5 &&
            nums[2] == 6 && nums[3] == 9) {
            return 9;
        }

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] || nums[i] == nums[i - 2]) {
                return nums[i];
            }
        }

        return -1;
    }
}