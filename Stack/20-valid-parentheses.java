
// by using Stack concept this problem is Solved
//first pushing opening brackets only then if closing bracket occurs we check all possibilities
//after all possibilities checked if still stack is non empty then answer will be false else answer will be true

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(ch == ')'){
                    if(st.isEmpty() || st.pop() != '('){
                        return false;
                    }
                }
                if(ch == '}'){
                    if(st.isEmpty() || st.pop() != '{'){
                        return false;
                    }
                }
                if(ch == ']'){
                    if(st.isEmpty() || st.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}