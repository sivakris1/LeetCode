class Solution {
    int minVal = Integer.MAX_VALUE;
    public int smallestValue(int n) {
        factors(n);
        return minVal;
    }

    public void factors(int val){
        int sum = 0;
        int factor = 2;

        if(isPrime(val)){
            minVal = val;
            return;
        }

        int originalVal = val;

        while(val > 1){
            if(val % factor == 0){
                sum = sum + factor;
                val = val / factor;
            }
            else{
                factor++;
            }
        }

        if (sum == originalVal) {
            minVal = sum;
            return;
        }

        factors(sum);
    }

    public boolean isPrime(int n) {
    // 1 and numbers <= 1 are NOT prime
    if (n <= 1) {
        return false;
    }

    // Check if any number from 2 up to sqrt(n) divides n
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false; // Found a factor, so it is NOT prime!
        }
    }

    return true; // No factors found, so it IS prime!
}

}