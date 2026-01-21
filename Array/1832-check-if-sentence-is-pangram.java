class Solution {
    public boolean checkIfPangram(String sentence) {
        //take array with 26 because to store value using ascaii values
        int ans[] = new int[26];

        for(int i=0;i<sentence.length();i++){
            //this gives ascii value of that particular alphabet
            int res = sentence.charAt(i) - 'a';
            ans[res] = 1;
        }
        int answer = 0;
        for(int i=0;i<ans.length;i++){
           answer += ans[i];
            if(answer >= 26){
                return true;
            }
        }
        return false;
    }
}