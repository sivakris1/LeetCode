
//same stack concept is using here
//push into the stack the ones having opening bracket but we push index of that particular stack because we have to aware of which bracket is present atlast
//if closing bracket occurs then we pop from stack, here two possibilities first is if stack is empty means no open bracket is available for closing bracket so this has to be remvoed for final answer so we changing that particular bracket to # for identification so that we know this has to be removed
// and other possibility is pop from stack

//also possibility of open brackets left in stack as there may be close bracket doesnot exists hence here also we assign # to the indexes available in stack 

//atlast we eliminate the # item from String and return new String which is the required answer
class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == '('){
                stack.push(i);
            }
            if( arr[i] == ')'){
                if(stack.isEmpty()){
                    arr[i] = '#';
                }
                else{
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            arr[stack.pop()] = '#';
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            if(ch != '#'){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}