class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();

        Map<String,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

        for(int i=0;i<list2.length;i++){
            int val = 0;
            if(map.containsKey(list2[i])){
                val = map.get(list2[i])+i;
                if(val < min){
                    //reset result because of minimum value should be at first 
                    result = new ArrayList<>();
                    result.add(list2[i]);
                    //update min value 
                    min = Math.min(val,min);
                }
                //both equals to same min value then keep both
                else if(val == min){
                    result.add(list2[i]);
                }
            }
        }

        String[] arr = new String[result.size()];

        for(int i=0;i<arr.length;i++){
            arr[i] = result.get(i);
        }

        return arr;
    }
}