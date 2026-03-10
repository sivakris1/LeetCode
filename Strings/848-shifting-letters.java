class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();
        long count = 0;
        for(int i=shifts.length - 1 ;i>=0;i--){
            char ch = s.charAt(i);
            count = (count + shifts[i]) % 26;

            char newCh = (char) ((ch - 'a' + count) % 26 + 'a');

            sb.append(newCh);
        }
        return sb.reverse().toString();
    }
}