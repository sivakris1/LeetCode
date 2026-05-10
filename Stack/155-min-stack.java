class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    //approach -> maintaining two stacks, onw for main stack and another for minimum number maintaining stack
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty()){
            minStack.push(val);
        }
        else{
            minStack.push(Math.min(minStack.peek(),val));
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}