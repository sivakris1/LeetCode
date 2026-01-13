
//by using Two Pointer technique we can solve this Problem
//we place left at start and right at end
//we increase left until we found a valid character , same for right ,decreasing right until we found a valid character
//now we checks if both pointer values are equal or not. if they are palindrome they should equal if not then they will not equal

//if all characters equals to left and right pointers till right < left then given case is an Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            } 
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)) ){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}