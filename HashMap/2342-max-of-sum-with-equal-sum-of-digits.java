//approach1 : brute force approach with two loops 

class Solution {
    public int maximumSum(int[] nums) {
        int max = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int iSum = sumDigit(nums[i]);
                int jSum = sumDigit(nums[j]);

                if(iSum == jSum){
                    max = Math.max(max, nums[i]+nums[j]);
                }
            }
        }

        return max > 0 ? max : -1;
    }

    public int sumDigit(int number){
        int sum = 0;

        while(number > 0){
            int n = number % 10;
            sum += n;
            number = number/10;
        }

        return sum;
    }
}