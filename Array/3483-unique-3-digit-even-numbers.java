
//approach: by using brute force finding every 3 possible number and with help of set for no duplicate numbers
class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<digits.length; i++){
            if(digits[i] == 0){
                continue;
            }
            for(int j=0; j<digits.length; j++){
                for(int k=0; k<digits.length; k++){
                    if(i == j || j == k || i == k){
                        continue;
                    }

                    int num = digits[i]*100 + digits[j]*10 + digits[k];
                    
                    int lastDig = num % 10;

                    if(lastDig % 2 == 0){
                        set.add(num);
                    }
                }
            }
        }

        return set.size();
    }
}