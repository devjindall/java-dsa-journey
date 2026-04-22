// Last updated: 4/22/2026, 9:08:40 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int maxCount = 0;
        int element = nums[0];

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                element = entry.getKey();
            }
        }

        return element;
    }
}
