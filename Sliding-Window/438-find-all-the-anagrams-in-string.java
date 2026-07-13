class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> list = new ArrayList<>();
      List<Character> string = new ArrayList<>();
      int count = 0;
      int left = 0;

      int[] charCount = new int[26];

       if (s.length() < p.length()) {
          return list;
      }

      for(int i=0; i<p.length(); i++){
        char ch = p.charAt(i);
        charCount[ch - 'a']++;
      }

      for(int right=0; right<s.length(); right++){
        string.add(s.charAt(right));
        charCount[s.charAt(right) - 'a']--;
        count++;

        if(count == p.length()){
            boolean isAnag = false;
            for(int i=left; i<=right; i++){
                if(charCount[s.charAt(i) - 'a'] < 0){
                    isAnag = false;
                    break;
                }
                else{
                    isAnag = true;
                }
            }

            if(isAnag){
                list.add(left);
            }

            string.remove(0);
            charCount[s.charAt(left) - 'a']++;
            left++;
            count--;

        }
      }

      return list;
    }
}