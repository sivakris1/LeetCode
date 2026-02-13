class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        //store elements with their index
        for(int i=0;i<nums.length;i++){
            //enter only if elemenet is in hashmap
            if(map.containsKey(nums[i])){
                int diff = i - map.get(nums[i]);
                if(diff <= k){
                    return true;
                }
            }

            map.put(nums[i],i);

        }
        return false;
    }
}