class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            ans[i] = val*val;
        }

        int p1 = 0;
        int p2 = nums.length-1;
        int p3 = nums.length-1;

        int ans2[] = new int[nums.length];

        while(p1 <= p2){
            if(ans[p1] > ans[p2]){
                ans2[p3] = ans[p1];
                p1++;
            }
            else{
                ans2[p3] = ans[p2];
                p2--;
            }
            p3--;

        }
       

        return ans2;
        
    }

    


// public void sort(int[] nums, int left, int right){
    //     if(left >= right){
    //         return;
    //     }

    //     int start = left;
    //     int end = right;
    //     int mid = start+(end-start)/2;

    //     int pivot = nums[mid];

    //     while(start < end){

    //         while(nums[start] < pivot){
    //             start++;
    //         }

    //         while(nums[end] > pivot){
    //             end--;
    //         }

    //         if(start <= end){
    //           int temp = nums[start];
    //           nums[start] = nums[end];
    //           nums[end] = temp;
    //           start++;
    //           end--;
    //         }

    //     }

    //     sort(nums,left,end);
    //     sort(nums,start,right);
    // }


}