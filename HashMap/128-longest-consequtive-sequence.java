class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n: nums) set.add(n);

        int max = 0;

        for(int n: set){

            //if lesser value exists then dont go into it
            if(!set.contains(n-1)){
                int len = 1;
                while(set.contains(n + len)) len ++;
                max = Math.max(max, len);
            }
        }
        return max;
    }
}