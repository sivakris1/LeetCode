class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Backtracking(0,nums,current,result);
        return result;
    }

    public void Backtracking( int index, int[] nums, List<Integer> current, List<List<Integer>> result){
        
        if(index == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);

        Backtracking(index+1, nums, current, result);
        current.remove(current.size() - 1);

        Backtracking(index+1, nums, current, result);

    }
}