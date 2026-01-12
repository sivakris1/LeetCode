
// In this sum we have to find out the sub array which has to be smaller where the sum of all the elements in the sub array has to be greater or equal to the given target element
// solving this problem using Sliding Window approach, if we known k we can apply directly of kth sub array 
// but here we dont know k means we have to use Dynamic Sliding Window approach

//increasing the right pointer value first then if sum is greater or equal to target then we start reducing sub array and sum value from left


class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int right=0; right<nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                min = Math.min(min,right-left+1);
                sum -= nums[left];
                left++;
            }
        }

        return min==Integer.MAX_VALUE ? 0 : min;

        
    }
}