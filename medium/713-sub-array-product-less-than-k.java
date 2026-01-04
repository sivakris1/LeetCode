
//Solving this problem using Dynamic Sliding Window technique
//left and right pointer starts at 0, moving right pointer always and left pointer only moves when conflict occurs
//if product value is more than given k then decrease the window side by increasing left value and remove the value of left from mul

//the no. of subarray possible from one window is right-left+1

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int mul = 1;
        int value = 0;
        int n = nums.length;

        if(k <= 1){
            return 0;
        }

        for(int right=0; right<nums.length; right++){
            mul *= nums[right];

            while(mul >= k){
                mul /= nums[left];
                left++;
            }

            value += right-left+1;
            
        }
        return value;
    }
}