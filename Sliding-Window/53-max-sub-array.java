class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int left = 0;
        int max = nums[0];

        for(int right=0;right<nums.length;right++){
            sum += nums[right];

            //keeping this line ahead of while loop works for negative element testcases
            max = Math.max(max,sum);

            while(sum < 0 ){
                sum = 0;
                left++;
            }

        }

        return max;
    }
}