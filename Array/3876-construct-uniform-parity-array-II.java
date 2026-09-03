class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int num : nums1) {
            minVal = Math.min(minVal, num);
            if (num % 2 != 0) {
                hasOdd = true;
            }
        }

        if (minVal % 2 != 0) {
            return true;
        }

        return !hasOdd;
    }
}
