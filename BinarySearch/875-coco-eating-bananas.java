class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi = 0;
        for(int pile : piles) {
            maxi = Math.max(maxi, pile);
        }
        int low = 1;
        int high = maxi;
        int ans = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            long reqTime = calculateTotalHours(piles, mid);

            if(reqTime <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static long calculateTotalHours(int[] arr, int hourly) {
        long totalHours = 0;
        for(int pile : arr) {
            totalHours += (pile + hourly - 1L) / hourly;
        }
        return totalHours;
    }
}