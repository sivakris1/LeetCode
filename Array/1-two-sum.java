//Solving this problem by brute force which is by using two for loops , 1 pointer remains same and other one moves till equals to answer 
//storing the indexes values in new array result and returning it

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int result[] = new int[2];
        

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if( nums[i]+ nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}