class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String ch : tokens){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                int ans;
                if (ch.equals("+")) ans = a + b;
                else if (ch.equals("-")) ans = b - a;
                else if(ch.equals("*")) ans = a * b;
                else ans = b / a;

                stack.push(ans);
            }
            else{
                //converts to integer
                stack.push(Integer.parseInt(ch));
            }
        }

        return stack.pop();
    }
}