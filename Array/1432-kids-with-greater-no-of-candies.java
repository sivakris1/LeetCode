


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int highest = 0;

        //highest value stored
        for(int i=0;i<candies.length;i++){
            if(candies[i] > highest){
                highest = candies[i];
            }
        }

        //traverse for every element
        for(int i=0;i<candies.length;i++){
           int sum = candies[i] + extraCandies;

           //appends true to list 
            if(sum >= highest){
                list.add(true);
                
            }
            //appends false to list
            else{
                list.add(false);
            }
        }
        return list;
    }
}