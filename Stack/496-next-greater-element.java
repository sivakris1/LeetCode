class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();

        int[] nge = new int[nums2.length];

        for(int i=nums2.length-1; i>=0; i--){
            while(!st.isEmpty() && nums2[i] >= st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(nums2[i]);
        }

        //at the end of above for loop , the nge array contains the next greater elements of the given nums2 array
        //now by comparing nge and nums1 we can get the answer
        int[] result = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    result[i] = nge[j];
                    break;
                }
            }
        }


        return result;
    }
}