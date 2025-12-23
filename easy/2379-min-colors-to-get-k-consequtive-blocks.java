//1st approach, brute force method
//considering each and every character of every window and increasing the count of white for particular window
//after every window finding the minimum value and storing it in min so later we return min value

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = 0;
        int white = 0;

        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }
        }

        min = white;
        
        int start = 1;
        int end = k;
        int white2 = 0;

        while(end < blocks.length()){
            white2 = 0;
            for(int i=start;i<=end;i++){
               if(blocks.charAt(i) == 'W'){
                   white2++;
            }
          }

          if(white2 < min){
            min = white2;
          }


          start++;
          end++;
        }

        return min;
    }
}


//2nd approach, which is more efficient than before

//first window solved before with for loop singely, then we have total white count of first k window size
//now after entering next windows we wont consider every single character instead we just use start and end pointers
//if start-1 is W then decrease count of white by 1 and also end is W then increase count of white by 1
//after every window we find minimum element so min stores the most minimum value later we return it

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = 0;
        int white = 0;

        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }
        }

        min = white;
        
        int start = 1;
        int end = k;

        while(end < blocks.length()){
            if(blocks.charAt(start-1) == 'W'){
                white--;
            }
            if(blocks.charAt(end) == 'W'){
                white++;
            }

            min = Math.min(min,white);

            start++;
            end++;
         }

        return min;
    }
}