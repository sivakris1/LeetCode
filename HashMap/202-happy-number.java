class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n != 1){
            //the number wouldn't be happy number if it repeated 
          if(set.contains(n)){
            return false;
          }
          set.add(n);
          n = square(n);
        }

        return true;
    }


    //gives sum of squares of each digit for passed number
    private int square(int n){

         int ans = 0;

        while(n != 0){
             int digit = n % 10;

            ans += digit*digit;

            n = n/10;
        }


        return ans;        
    }
}