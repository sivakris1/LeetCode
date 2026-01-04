//Solving this problem by using Dynamic Sliding Window technique
//taking an arr of 256 because testcase may contain UpperLetters,Digits etc..
//storing the character at right pointer in ch and increasing the value of that ch in array
//if conflict occurs we start decreasing from the left pointer until confilct is resolved
//if no conflict occurs then we find the max length of subarray and store it and atlast increasing right pointer for every iteration

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[256];

        int left = 0;
        int right = 0;
        int length = 0;

        while(right < s.length()){
            char ch = s.charAt(right);
            arr[ch] ++;

            while(arr[ch] > 1){
                arr[s.charAt(left)]--;
                left++;
            }

            
                length = Math.max(length,right-left+1);
                right++;
            

            
            
        }
        return length;
    }
}