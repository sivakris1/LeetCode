
//we have to use subarrays for every element in code so we can solve this using Sliding Window technique
//first setting up left and right pointers for both negitive and positive k , once left and right pointers are settled then the process is same for k positive and k negitive
//adding sum of first element so that later windows we can use this sum and edit the sum for later windows
// using % for returning left and right to 0 or 0+ after index value crossing length of the code
//storing every sum result in new array ans and returning it at last

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        int left = 1, right = k;
        int sum = 0;

        

        if(k == 0){
            return ans;
        }

        if(k < 0){
            k = -k;
            left = n - k;
            right = n-1;
        }

        int index = left;

        for(int i=0;i<k;i++){
            sum += code[index++];
        }

        ans[0] = sum;

        for(int i=1;i<n;i++){
            sum = sum - code[(left++)%n];
            sum = sum + code[(++right)%n];

            ans[i] = sum;

        }
        return ans;
    }
}