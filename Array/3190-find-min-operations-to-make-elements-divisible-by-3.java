class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        for(int i=0;i<nums.length;i++){
            //other than 3 divisibles has to go under a operation so just increasing count because we have to just return the value
            if(nums[i] % 3 != 0){
                count++;
            }
        }
        return count;
    }
}