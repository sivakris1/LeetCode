class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], 0);
        }

        for(int i=1; i<=100; i++){
            if(!map.containsKey(k * i)){
                return k * i;
            }
        }
        return 101;
    }
}