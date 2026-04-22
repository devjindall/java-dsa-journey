// Last updated: 4/22/2026, 9:08:51 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        int n = arr.length;
        return arr[n-1].length();
    }
}