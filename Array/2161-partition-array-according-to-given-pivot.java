class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> lesser = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        ArrayList<Integer> equals = new ArrayList<>();

        int[] ans = new int[nums.length];

        for(int num : nums){
            if(num < pivot){
                lesser.add(num);
            }
            else if(num > pivot){
                greater.add(num);
            }
            else{
                equals.add(num);
            }
        }

        int idx = 0;
        int i = 0;
        while(i < lesser.size()){
            ans[idx] = lesser.get(i);
            i++;
            idx++;
        }
        i = 0;
        while(i < equals.size()){
            ans[idx] = equals.get(i);
            i++;
            idx++;
        }
        i = 0;
        while(i < greater.size()){
            ans[idx] = greater.get(i);
            i++;
            idx++;
        }

        return ans;
    }
}