class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int[] minSuffix = new int[nums.length];

        minSuffix[n-1] = nums[n-1];
        for(int i=nums.length-2; i>=0; i--){
            minSuffix[i] = Math.min(nums[i], minSuffix[i+1]);
        }

        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);

            if(max - minSuffix[i] <= k){
                return i;
            }
        }

        return -1;
    }
}