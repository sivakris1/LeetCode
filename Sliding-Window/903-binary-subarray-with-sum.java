
//In this problem normal sliding window approach will fail because of 0 and 1's in this problem, 0 makes problem whether to compress or expand the window
//so to solve this we use a new trick by using helper function
//this function will add all the possible subarrays if sum <= goal 

//by using this function we first find all the subarrays for goal then again using this function to find all the subarrays for goal-1
//then subtracting those will give the exact required answer

// [ex]: suppose goal = 2
// total subarrays of [0,1,2] - total subarrays of [0,1] = final subarrays of [2] which is the required answer

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return helper(nums,goal)-helper(nums,goal-1);
    }

    public int helper(int[] nums, int goal){
         int left = 0;
        int sum = 0;
        int count = 0;

        if(goal < 0){
            return 0;
        }

        for(int right=0; right<nums.length; right++){
            sum += nums[right];
            

            while(sum > goal){
                sum -= nums[left];
                left++;
            }

                count += right-left+1;
            
        }

        return count;
    }
}