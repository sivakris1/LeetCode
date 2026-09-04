class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int min = Integer.MAX_VALUE;
            max = Math.max(max, nums[i]);
            int j = i;
            while(j <= nums.length-1){
                min = Math.min(min, nums[j]);
                j++;
            }

            if(max - min <= k){
                return i;
            }
        }
        return -1;
    }
}