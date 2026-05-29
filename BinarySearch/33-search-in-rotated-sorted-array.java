class Solution {
    public int search(int[] nums, int target) {
       int pivotAns = pivot(nums,0,nums.length-1);

       if (pivotAns == -1) {
          return binarySearch(nums, 0, nums.length - 1, target);
        }

       if(nums[pivotAns] == target){
         return pivotAns;
       }

       if(target >= nums[0]){
         return binarySearch(nums,0,pivotAns-1,target);
       }
       return binarySearch(nums,pivotAns+1,nums.length-1,target);
    }

    public int pivot(int[] nums, int start, int end){

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }

    public int binarySearch(int[] nums,int start, int end, int target){

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return -1;
    }
}