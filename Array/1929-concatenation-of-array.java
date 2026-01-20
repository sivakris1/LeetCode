class Solution {
    public int[] getConcatenation(int[] nums) {
        int nums2[] = new int[2*nums.length];
        int idx = 0;  //initial index

        //just for 2 iterations
        for(int i=0;i<2;i++){
            //every iteration 
            for(int j=0;j<nums.length;j++){
                nums2[idx] = nums[j];
                idx++;
            }
        }
        return nums2;
    }
}