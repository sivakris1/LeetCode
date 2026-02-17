class Solution { // <--- You are missing this
    public int maximumPopulation(int[][] logs) {
        int[] yearChanges = new int[2051]; // Using 2051 to accommodate year 2050

        for (int[] log : logs) {
            yearChanges[log[0]]++;
            yearChanges[log[1]]--;
        }

        int maxPop = 0;
        int currentPop = 0;
        int earliestYear = 1950;

        for (int year = 1950; year <= 2050; year++) {
            currentPop += yearChanges[year];
            if (currentPop > maxPop) {
                maxPop = currentPop;
                earliestYear = year;
            }
        }
        return earliestYear;
    }
}
