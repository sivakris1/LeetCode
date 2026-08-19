
//approach1 : this is work for normal values but for MAX_VAL's Time Limit Exceeds
class Solution {
    public double myPow(double x, int n) {
        double ans = 1;

        if(n < 0){
            int val = -(n);

            for(int i=0; i<-(n); i++){
            ans = ans * x;
           }
           ans = 1/ans;
        }
         else{
            for(int i=0; i<n; i++){
            ans = ans * x;
        }

        }

        return ans;
    }
}

//approach2 : multiplying x with x in every single iteration and updating result when power value hits odd
class Solution {
    public double myPow(double x, int n) {
        long power = Math.abs((long) n);
        double result = 1;

        while(power > 0){
            if(power % 2 == 1) result = result * x;
            x = x * x;
            power = power/2;
        }

        return n < 0 ? 1/result : result;
    }
}