class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(ransomNote.length() > magazine.length()){
            return false;
        }

        for(int i=0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);

            if(map.get(ch) == null || map.get(ch) <= 0){
                return false;
            }

            if(map.get(ch) > 0){
                map.put(ch, map.getOrDefault(ch, 0)-1);
            }
        }

        return true;
    }
}