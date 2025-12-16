

//Solved this Container With Most Water leetcode problem by applying Two Pointer technique by placing first pointer at starting and second pointer at last of the array 
//initializing a result value with 0 and later if two pointers answer is greater than 0 then we assign that value to result

//manipulaing pointer is main thing in this problem, so if 1st pointer is smaller then doing p1++ else p2++ 
class Solution {
    public int maxArea(int[] height) {
        int result = 0;

        int p1 = 0;
        int p2 = height.length-1;

        while(p2>p1){
            int value;
            if(height[p1] > height[p2]){
                value = height[p2] * (p2-p1);
                if(value > result){
                    result = value;
                }
                p2--;
            }
            else{
                value = height[p1] * (p2-p1);
                if(value > result){
                    result = value;
                }
                p1++;
            }
            
            
        }
        return result;
    }
}