
//have to find the maximum length of the substring whose substring doesnot exceed the value 2 of length of an character 
//we use an array of length 26 so that every specific alphabet value stores at their index

//we doesnot know k value, so we have to use dynamic sliding window approach
//so we take 2 pointers at starting, gradually we increase right pointer but condition not satisfied then increases left pointer
//if we get maximum length of any particular substring we store it 
//atlast after loop ends we return window size which is maximum

class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0,right=0;

        int window = 0;

        int[] arr = new int[26];

        while(right < s.length()){
            int index = s.charAt(right) - 'a';

            if(arr[index] < 2){
                arr[index]++;
                window = Math.max(window,right-left+1);
                right++;
                
            }
            else{
                int leftIndex = s.charAt(left) - 'a';
                arr[leftIndex]--;
                left++;
            }
        }
        return window;
    }
}