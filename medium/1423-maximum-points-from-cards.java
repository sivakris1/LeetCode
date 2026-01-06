class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int start = cardPoints.length-k;
        int end = 0;
        int sum = 0;

        // while(start < cardPoints.length){
            for(int i=start;i<cardPoints.length;i++){
                sum += cardPoints[i];
            }
            // start++;
        // }

        int max= sum;

        while(start < cardPoints.length){
            sum -= cardPoints[start];
            sum += cardPoints[end];
            start++;
            end++;

            max = Math.max(max,sum);
        }



        return max;
    }
}