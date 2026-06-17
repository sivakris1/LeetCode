class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int currentNum = 0;

        int currNum = 0;
        String currString = "";

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                currentNum = currentNum * 10 + (ch - '0');
            }
            else if(ch == '['){
                countStack.push(currentNum);
                stringStack.push(currentString);
                currentNum = 0;
                currentString = "";
            }
            else if(ch == ']'){
                int count = countStack.pop();
                String prev = stringStack.pop();
                String repeated = "";

                for(int i=0;i<count;i++){
                    repeated += currentString;
                }

                currentString = prev + repeated;
            }
            else{
                currentString += ch;
            }
        }

        return currentString;
    }
}