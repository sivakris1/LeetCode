class Solution {
    public int[] transformArray(int[] nums) {
        int[] newArr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 == 0){
                newArr[i] = 0;
            }
            else{
                newArr[i] = 1;
            }
        }

        Arrays.sort(newArr);

        return newArr;
    }
}