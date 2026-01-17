
//Solving this Problem using Stack concept
//taking an new Stack for storing the non equal values between the given two arrays
//so now traversing the pushed array and checking whether the present value of pushed array is equals to popped array present value
//if equals then pop the value and increase the pop array index else we have to push it into stack
//this process continues till we travesed all the values in pushed array
//and finally if stack is empty then the test case is true other wise false

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        if(pushed.length != popped.length){
            return false;
        }
        int push_idx = 0;
        int pop_idx = 0;
        
        for(int pushVal : pushed){
             stack.push(pushVal);
             while(!stack.isEmpty() && stack.peek() == popped[pop_idx]){
                stack.pop();
                pop_idx ++;
           }
        }
        return stack.isEmpty();
    }
}