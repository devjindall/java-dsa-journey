// Last updated: 4/22/2026, 9:08:13 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for(int i = 1;i<=n;i++){
            if(i%m == 0){
                num1 = num1 + i;
            }
 
            if(i%m !=0){
                num2+=i;
            }
        }

        return num2 - num1;
    }
}