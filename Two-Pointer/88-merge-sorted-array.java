package easy;

//Solved the merge_sorted_array by using mergeSort, here question requires to just arrange the array given in question by guven logic, hence we use inplace technique here. we have to use just merge technique here to solve the problem because here arrays are already sorted

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = 0;
       int j = 0;
       int k = 0;

       int[] mix = new int[nums1.length];

       while(i < m && j < nums2.length){
        if(nums1[i] < nums2[j]){
            mix[k] = nums1[i];
            i++;
        }
        else{
            mix[k] = nums2[j];
            j++;
        }
        k++;

       }

         while(i < m){
            mix[k] = nums1[i];
            i++;
            k++;
        }

        while(j < nums2.length){
            mix[k] = nums2[j];
            j++;
            k++;
        }

        for(int l = 0;l<mix.length;l++){
            nums1[l] = mix[l];
        }

    }
}