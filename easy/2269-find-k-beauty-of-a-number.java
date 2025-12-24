
//here just one integer number was given and k value given so we have to find whether the number is divisor of given number or not
//by using % , we can get last values but if we start from start it is difficult so we start from ending
//repeating the loop k times and checking the value if it is divisor of given number or not
//at last removing last element using /10 so that everytime loop runs one value which is at last will be decreased

class Solution {
    public int divisorSubstrings(int num, int k) {
        int tenK = (int)Math.pow(10,k);
        int original = (int) num;
        int count = 0;

        int n = (int) Math.log10(num)+1;

        int timer = n-k+1;

        while(n >= k){
            int divisor = num % tenK;

            if(divisor!=0 && original%divisor == 0){
                count++;
            }

            num = num/10;
            n--;
        }

        return count;
    }
}