class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String s1 = s.strip();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);

            if(ch == ' '){
                //count resets to 0 when it founds ' '
                count = 0;
            }
            else{
                count++;
            }
        }
        return count;
    }
}