class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            //first increment so that no errors will get if key was first time.
            map.put(key,map.getOrDefault(key,0)+1);
            if(map.get(key) > 1){
                list.add(nums[i]);
            }
            
        }

        int[] result = new int[list.size()];
for (int i = 0; i < list.size(); i++) {
    result[i] = list.get(i); // Auto-unboxing happens here
}
return result;

    }
}