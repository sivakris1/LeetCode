
//Solved the sort colors problems using quicksort, getting the pivot element for every function and sorting it first and then going to sort left and right side of pivot, in this way all the pivot elements will get into right positons and at last array will be sorted
class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums,0,nums.length-1);
    }

    public static void quicksort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end-start)/2;

        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }

        }

        quicksort(nums,low,end);
        quicksort(nums,start,high);
    }
}


// Again solved this problem using another sorting techinique MergeSort, here mergesort is not much efficient than quicksort but still sorting the required array

class Solution2 {
    public void sortColors(int[] nums) {
        mergesort(nums,0,nums.length);
    }

    public static void mergesort(int[] nums, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = start+(end-start)/2;

        mergesort(nums,start,mid);
        mergesort(nums,mid,end);

        merge(nums,start,mid,end);
    }

    public static void merge(int[] nums, int start, int mid, int end){
        int i = start;
        int j = mid;
        int k = 0;

        int[] mix = new int[end-start];

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