class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int value = nums[j] - nums[i];

                //array is not in sorted so value may equals to negative
                if(value == k || value == -k){
                    ans++;
                }
            }
        }
        return ans;
    }
}