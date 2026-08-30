class Solution {
    public int countSubstrings(String s) {
        int totalPalindromes = 0;
       for(int i=0; i<s.length(); i++){
        totalPalindromes += expand(s,i,i);
        totalPalindromes += expand(s,i,i+1);
       }

       return totalPalindromes;
    }

    public int expand(String s, int left, int right){
        int count = 0;
        while(left >= 0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }

        return count;
    }
}