class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxLen = 0;

        map.put(0,-1);

        // approach: to replace all the 0's to -1 so that side by side elements can result into 0 and we 
        // can find the longest contiguous array
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen, i - map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}