
//Solving this Problem by using sliding window technique
//first initializing a zero variable with 0 and increasing it when 0 occurs in the array
//now doing Dynamic SLiding Window by increasing right side until conflict occurs, if conflict occurs then left side will decrease till the conflict resolved
//saving the maximum occured value in every iteration and returning it

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int max = 0;
        int zero = 0;
        
        for(int right=0;right<nums.length;right++){

            if(nums[right] == 0){
                zero++;
            }

            while(zero > k){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }

            max = Math.max(max,right-left+1);
        }

        return max;
        
    }
}