
//Once again here normal Sliding Window Approach wont work because we have to increase left not only on invalid condition but also on valid condition
//we use Atmost helper function when we stuck between moving left or right

//this Atmost function returns the total subarrays which are lesser or equal to k
//atlast we subtract Atmost(nums,k)-Atmost(nums,k-1) so we get exact answer

//ex: k=3
//  [0,1,2,3] - [0,1,2]  => [3] which is the required for answer by counting the total no. of subarrays of [3]


class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       
        return Atmost(nums,k)-Atmost(nums,k-1);
    }

    private int Atmost(int[] nums, int k){
         int left = 0;
        int oddVal = 0;
        int count = 0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]%2 != 0){
                oddVal++;
            }

            while(oddVal > k){
                if(nums[left]%2 != 0){
                oddVal--;
               }
               left++;
            }

            
               count += right-left+1;
            

            
        }

        return count;
    }
}