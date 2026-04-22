// Last updated: 4/22/2026, 9:08:24 PM
class Solution {
public:
    int countOdds(int low, int high) {
         int count = 0;
        for(int i = low;i<=high;i++){
            if(i%2 == 1){
                count++;
            }
        }
        return count;
    }
};