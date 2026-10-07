class Solution {
    int count = 0;
    public int addDigits(int num) {
        int val = digits(num);
        int ans = 0;

        while(count > 1){
            val = digits(val);
        }

        return val;
    }

    public int digits(int n){
        count = 0;
        int ans = 0;
        while(n > 0){
            int val = n % 10;

            ans += val;
            count++;

            n = n / 10;
        }

        return ans;
    }
}