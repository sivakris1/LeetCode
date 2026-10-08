class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                //skips first opening parenthesis
                if(opened > 0){
                    sb.append(c);
                }
                opened++;
            }
            else{
                //skips last closing parenthesis
                opened--;
                if(opened > 0){
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}