class Solution {
    public boolean checkDivisibility(int n) {
        int mul = 1;
        int sum = 0;
        int num = n;

        while(num > 0){
            int val = num % 10;
            
            sum += val;
            mul *= val;
            

            num = num/10;
        }

        return n % (sum+mul) == 0;
    }
}