class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        
        int gcd = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            small = Math.min(small, nums[i]);
            large = Math.max(large, nums[i]);
        }

        for(int i=1; i<=large; i++){
            if(small % i == 0 && large % i == 0){
                gcd = Math.max(gcd, i);
            }
        }

        return gcd;
    }
}