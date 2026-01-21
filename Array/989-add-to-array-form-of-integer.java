class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        int i = num.length-1;

        //just doing addition like in maths
        //ex: [1,2,0,0] k=34
        //      1200
        //        34
        //    = 1234  

        while(i >=0 || k > 0){
            //adds element in last to k so that last sum updates and add it to list
            if (i >= 0) {
                k += num[i];
            }
            list.add(k % 10);

            k = k/10;
            i--;
        }
        Collections.reverse(list);
        return list;
    }
}