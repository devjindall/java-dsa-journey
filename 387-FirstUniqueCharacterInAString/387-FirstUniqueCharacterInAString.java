// Last updated: 4/22/2026, 9:08:34 PM
class Solution {
    public int firstUniqChar(String s) {
        char arr[] = s.toCharArray();
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : arr){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for(int i = 0;i<arr.length;i++){
            if(freq.get(arr[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}