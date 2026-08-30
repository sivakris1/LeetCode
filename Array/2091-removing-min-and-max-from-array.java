
//approach : find out indexes of min value and max value in array and find out all 3 possibilities, atlast return min possibile value
class Solution {
    public int minimumDeletions(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        if(nums.length == 1){
            return 1;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                p1 = i;
                max = nums[i];
            }
            if(nums[i] < min){
                p2 = i;
                min = nums[i];
            }
        }

        int maxDist = -1;
        int minDist = -1;

        if(p1+1 - 0 < (nums.length) - (p1)){
            maxDist = p1 + 1;
        }
        else{
            maxDist = nums.length - (p1);
        }

       int option1 = Math.max(p1, p2) + 1;

       int option2 = nums.length - Math.min(p1, p2);

       int option3 = (Math.min(p1, p2) + 1) + nums.length - Math.max(p1, p2);

        return Math.min(option1, Math.min(option2, option3));
    }
}