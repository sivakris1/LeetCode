class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<order.length(); i++){
            char ch = order.charAt(i);

            if(map.containsKey(ch)){

                while(map.get(ch) >= 1){
                    sb.append(ch);
                    map.put(ch, map.getOrDefault(ch ,0)-1);
                }
            }
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) >= 1){
                sb.append(ch);
                map.put(ch, map.getOrDefault(ch ,0)-1);
            }
        }

        return sb.toString();
    }
}