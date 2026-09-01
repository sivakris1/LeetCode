class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int totalSum = 0;

        map.put(0, -1);

        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];

            if(map.containsKey(totalSum % k)){
                if(i - map.get(totalSum % k) >= 2){
                    return true;
                }
            }
            else{
                map.put(totalSum % k, i);
            }
        }

        return false;
    }
}