class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxVal = -1;

        int left = 0;
        int right = k-1;

        while(right < nums.length){
            Set<Integer> windowSet = new HashSet<>();
            for(int ptr=left; ptr<=right; ptr++){
                windowSet.add(nums[ptr]);
            }
            for( int num : windowSet){
                map.put(num, map.getOrDefault(num, 0)+1);
                
            }
            left++;
            right++;
        }

        for(int i=0; i<nums.length; i++){
            int count = map.get(nums[i]);
            if(count == 1){
                maxVal = Math.max(maxVal, nums[i]);
            }
        }

        return maxVal;
    }
}