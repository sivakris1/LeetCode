class Solution {
    public boolean halvesAreAlike(String s) {
        int a = numOfVowels(s,0,s.length()/2);
        int b = numOfVowels(s,s.length()/2,s.length());

        if(a == b){
            return true;
        }
        else{
            return false;
        }
    }

    private int numOfVowels(String s,int start,int end){
        int count = 0;
        for(int i=start;i<end;i++){
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        return count;
    }
}