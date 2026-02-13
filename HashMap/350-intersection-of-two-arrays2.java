class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         List<Integer> list = new ArrayList<>();
         HashMap<Integer,Integer> map = new HashMap<>();

         //traverse all elements and all elements to hashmap first
         for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
         }

         //now checks whether present element in 2nd array is exists in hashmap or not
         for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                if(map.get(nums2[i]) > 0){
                    list.add(nums2[i]);
                int val = map.get(nums2[i]);
                map.put(nums2[i],val-1);
                }
            }
         }

         int[] arr = new int[list.size()];

         for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
         }

         return arr;
    }
}