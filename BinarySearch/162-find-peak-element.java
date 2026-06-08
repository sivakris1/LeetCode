

class Solution {
    public int findPeakElement(int[] nums) {
        return peakIndex(nums,0,nums.length-1);
    }

    public int peakIndex(int[] nums, int start, int end){

        while(start < end){

            int mid = start+(end-start)/2;

            if(nums[mid] > nums[mid+1]){
                 end = mid;
            }

            if( nums[mid] < nums[mid+1]){
                start = mid + 1;
            }
        }
        return start;
    }
}