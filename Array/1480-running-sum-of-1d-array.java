class Solution {
    public int[] runningSum(int[] nums) {
        int nums2[] = new int[nums.length];
        int ans = 0; //initial sum

        for(int i=0;i<nums.length;i++){
            //adding every element in every iteration
            ans += nums[i];
            nums2[i] = ans;
        }
        return nums2;
    }
}