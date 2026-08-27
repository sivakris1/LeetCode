class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int count = 0;
        int idx1 = 0;
        int idx2 = 0;

        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);

            if(ch == '1'){
                count++;
            }

            while(count == k){

                while(s.charAt(left) == '0'){
                    left++;
                }

                if(right-left+1 < minLen){
                    idx1 = left;
                    idx2 = right;
                    minLen = right-left+1;
                }
                else if(right-left+1 == minLen){
                    String currentSub = s.substring(left, right+1);
                    String bestSub = s.substring(idx1, idx2 + 1);
                    if(currentSub.compareTo(bestSub) < 0){
                        idx1 = left;
                        idx2 = right;
                    }
                }

                if(s.charAt(left) == '1'){
                    count --;
                }

                left++;

            }
        }

        if(minLen == Integer.MAX_VALUE){
            return "";
        }

        String ans = "";
        for(int i=idx1; i<=idx2; i++){
            ans = ans + s.charAt(i);
        }

        return ans;
    }
}