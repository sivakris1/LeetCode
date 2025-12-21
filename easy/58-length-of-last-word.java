

// by using for loop iterating all the characters one by one, if finding a ' ' then ans value will be set to 0 else it will increase the ans value by 1 at last after completing the loop it returns the ans value

class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        String str = s.trim();
        if(str.length() == 0){
            return 0;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                ans = 0;
            }
            else{
                ans += 1;
            }
        }
        return ans;
    }
}