class Solution {
    public int maxOperations(int[] nums, int k) {
        //Sort given array to enable two pointer approach
        Arrays.sort(nums);

        int p1 = 0;
        int p2 = nums.length-1;
        int count = 0;

        while(p1 < p2){
            int sum = nums[p1] + nums[p2];

            if(sum == k){
            //valid answer found so increase the count and move both pointers
                count++;
                p1++;
                p2--;
            }
            else if(sum > k){
            // Decrease sum by moving the right pointer inward
                p2--;
            }
            else{
            // Increase sum by moving the left pointer inward
                p1++;
            }
        }
        return count;
    }
}