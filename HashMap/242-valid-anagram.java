class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        if(t.length() != s.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);

            if(!map.containsKey(ch)){
                return false;
            }

            map.put(ch,map.get(ch)-1);

            if(map.get(ch) < 0){
                return false;
            }
        }

        return true;

    }
}