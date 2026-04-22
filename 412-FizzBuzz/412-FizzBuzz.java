// Last updated: 4/22/2026, 9:08:33 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> str = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(i%15 == 0){
                str.add("FizzBuzz");
            }
            else if(i%5 == 0){
                str.add("Buzz");
            }
            else if(i%3==0){
                str.add("Fizz");
            }
            else{
                Integer a= i;
                str.add(a.toString());
            }
        }
        return str;
    }
}