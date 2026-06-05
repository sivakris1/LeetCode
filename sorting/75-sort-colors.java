
//approach: Using MergeSort Inplace technique for solving this question

class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length);

    }

    public void mergeSort(int[] nums, int start, int end){
        //[7,2,5,8,2,4,1]

        if(end-start == 1){
            return;
        }

        int mid = start + (end-start)/2;

        mergeSort(nums,start,mid);
        mergeSort(nums,mid,end);

        merge(nums,start,mid,end);
    }

    public void merge(int[] nums, int start, int mid, int end){
        int[] mix = new int[end-start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(nums[i] < nums[j]){
                mix[k] = nums[i];
                i++;
            }
            else{
                mix[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            mix[k] = nums[i];
            i++;
            k++;
        }

        while(j < end){
            mix[k] = nums[j];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;l++){
            nums[start+l] = mix[l];
        }
    }
}