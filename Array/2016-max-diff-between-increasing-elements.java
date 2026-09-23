class Solution {
    public int maximumDifference(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }

            max = Math.max(max, nums[i]-min);
        }

        if(max == 0){
            return -1;
        }

        return max;
    }
}