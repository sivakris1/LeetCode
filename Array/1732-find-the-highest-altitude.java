class Solution {
    public int largestAltitude(int[] gain) {

        //new array with length n+1
        int[] altitude = new int[gain.length+1];
        int sum = 0;  //represents sum of previous values
        int max = 0;  //represents highest altitude
        altitude[0] = sum;
        for(int i=1;i<altitude.length;i++){
            sum += gain[i-1];
            altitude[i] = sum;

            if(sum > max){
                max = sum;
            }
        }

        
        return max;
    }
}