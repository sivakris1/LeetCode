
// so we have to find the maximum average of all possible subarray with the given k value in nums array
// so by using sliding window we can solve this problem
// first initializing sum to 0 and adding all the values till k from nums[0] so that first window is completed
// we start finding the answer from next windows by manipulating the pointers until end reaches the length of the array nums


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        double maxAvg =(double) sum/k;

        int start = 1;
        int end = k;

        while(end < nums.length){
            sum = sum-nums[start-1]+nums[end];
            double avg =(double) sum/k;

            maxAvg = Math.max(maxAvg,avg);
            start++;
            end++;
        }

        return maxAvg;
    }
}