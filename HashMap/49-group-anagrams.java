class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //the technique used here is sorting the string now search in hashmap if it exists in hashmap, 
        // if exists then add that string to that particular element as list
        //otherwise store the present sorted string as new element
        Map<String, List<String>> map = new HashMap<>();

        List<List<String>> res = new ArrayList<List<String>>();

        for(String str : strs){
            char[] ca = str.toCharArray();

            
            Arrays.sort(ca);

            String key = new String(ca);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        for(Map.Entry<String, List<String>> e : map.entrySet()){
            res.add(e.getValue());
        }

        return res;
    }
}