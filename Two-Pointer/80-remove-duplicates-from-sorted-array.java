class Solution {
    public int removeDuplicates(int[] nums) {
        int freq = 1; // frequency of current number
        int p1 = 1;  // next valid position to write

        for(int i=1;i<nums.length;i++){
            //increase freq value when present and before values equal
            if(nums[i] == nums[i-1]){
                freq++;
            }

            //reset freq to 1 if new value occurs
            if(nums[i] != nums[i-1]){
                freq = 1;
            }

            // Allow at most two occurrences of each number

            if(freq <= 2){
                nums[p1] = nums[i];
                p1++;
            }



        }

        //represents the length of the valid array prefix
        return p1;
    }
}