// This problem has only one array, so we have to approach it with manipulating the indexes of the given array. hence we use divide and conquere technique (mergeSort) to solve this problem  


class Solution {

    public int[] sortArray(int[] nums) {
         mergesort(nums,0,nums.length);
         return nums;
    }

    public static void mergesort(int[] nums, int start, int end){
        if(end-start == 1){
            return;
        }
        int s = start;
        int e = end;
        int mid = (s+e)/2;

        mergesort(nums,s,mid);
        mergesort(nums,mid,e);

        merge(nums,s,mid,e);
    }

    public static void merge(int[] nums, int start, int mid, int end){
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

        while(i < mid) {
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


