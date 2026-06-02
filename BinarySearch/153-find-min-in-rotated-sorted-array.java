class Solution {
    public int findMin(int[] nums) {
        int pivotAns = pivot(nums, 0, nums.length-1);

        //if not rotated array then it is sorted array
        if(pivotAns == -1){
            return nums[0];
        }

        return nums[pivotAns];
    }

    public int pivot(int[] nums, int start, int end){

        while(start <= end){
            int mid = start + (end-start)/2;

            //returns only pivot with small in both conditions 

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid+1;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid;
            }

            if(nums[start] < nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
}