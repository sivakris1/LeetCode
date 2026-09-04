class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int max_val = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            
            if(prefix == 0){
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];

            max_val = Math.max(max_val, Math.max(prefix,suffix));
        }

        return max_val;
    }
}