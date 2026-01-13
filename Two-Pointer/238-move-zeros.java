
//solution for leetcode problem 238 which is Move Zeros
class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];

        int p1 = 0;
        int p2 = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                p1++;
            }
            else{
                ans[p2] = nums[i];
                p2++;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = ans[i];
        }
    }
}