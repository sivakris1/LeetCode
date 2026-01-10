
//Solving this Problem Using Sliding Window Approach
//this problem contains only a,b,c characters hence taking the array length as only 3
//once all the character length reached 1 then we increment the count and the length of remaining elements
//also compressing the window right after increamenting count because count contains that window capable elements so another window has to be considered
//atlast after finishing for loop return the count 

class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3];
        int count = 0;
        int left = 0;

        for(int i=0;i<s.length();i++){
            int index =  s.charAt(i) - 'a';
            arr[index]++;

            while(arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1){
                count++;
                count += s.length()-i-1;

                int leftIdx = s.charAt(left) - 'a';
                arr[leftIdx]--;
                left++;
            }
        }

        return count;
    }
}