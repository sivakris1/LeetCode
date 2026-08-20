class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        if(nums.length <= 2){
            return nums;
        }
        list1.add(nums[0]);
        list2.add(nums[1]);

        for(int i=2; i<nums.length; i++){
            if(list1.getLast() > list2.getLast()){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }

        int[] ans = new int[nums.length];
        int idx = 0;

        for(int i=0; i<list1.size(); i++){
            ans[idx] = list1.get(i);
            idx++;
        }

        for(int i=0; i<list2.size(); i++){
            ans[idx] = list2.get(i);
            idx++;
        }

        return ans;
    }
}