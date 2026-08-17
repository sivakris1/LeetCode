
//approach : by using stack, checking the peek value and present value and perform operations
class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n = ast.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            boolean isThere = true;
            while(!st.isEmpty()){
                if(ast[st.peek()]>0 && ast[i]<0){
                    if(Math.abs(ast[i]) > Math.abs(ast[st.peek()])){
                        st.pop();
                    }
                    else{
                        if(Math.abs(ast[i]) == Math.abs(ast[st.peek()]))
                            st.pop();
                        isThere = false;
                        break;
                    }
                }else{
                    break;
                }
            }
            if(isThere) st.push(i);
        }

        int ans[] = new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = ast[st.pop()];
        }

        return ans;
    }
}