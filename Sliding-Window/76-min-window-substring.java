class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() < t.length()){
            return "";
        }

        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
        }

        int left = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right=0; right<s.length(); right++){

            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                
                if(map.get(ch) > 0){
                    count++;
                }
                map.put(ch, map.getOrDefault(ch, 0)-1);
            }

            //shrinking starts from left once we got the substring containing all characters from t
            while(count == t.length()){
                if(right-left+1 < minLen){
                    //for finding minimum window
                    minLen = right-left+1;
                    //for substring starting value
                    start = left;
                }

                char leftCh = s.charAt(left);
                
                if(map.containsKey(leftCh)){
                    map.put(leftCh, map.get(leftCh)+1);
                    
                    if(map.get(leftCh) > 0){
                        count --;
                    }
                }
                
                left++;
            }



            
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start+minLen);
    }
}