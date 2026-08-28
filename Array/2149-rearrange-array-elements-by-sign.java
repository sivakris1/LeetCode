class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length/2;
        int[] even = new int[n];
        int[] odd = new int[n];

        int[] ans = new int[nums.length];
        int idx1 = 0;
        int idx2 = 0;

        for(int num : nums){
            if(num > 0){
                even[idx1] = num;
                idx1++;
            }
            else{
                odd[idx2] = num;
                idx2++;
            }
        }

        int p1 = 0;
        int p2 = 0;
        int idx = 0;

        while(p1 < n){
            ans[idx] = even[p1];
            p1++;
            idx++;
            ans[idx] = odd[p2];
            p2++;
            idx++;
        }

        return ans;
    }
}