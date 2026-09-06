
//This is the solution of the LeetCode Problem 881- Boats to Save People, done with two-pointer technique by placing one pointer at first and second pointer at last after sorting the given array.
//  manipulating the pointers by comparing with given limit value and comparing with addition value of two pointers

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int p1 = 0;
        int p2 = people.length-1;
        int boat = 0;

        while(p1 <= p2){
            int add = people[p1] + people[p2];
            if(p1 == p2){
                boat++;
                break;
            }
            if(people[p1] >= limit){
                boat++;
                p1++;
            }
            else if(people[p2] >= limit){
                boat++;
                p2--;
            }
            else if(add > limit){
                p2--;
                boat++;
            }
            else if(add < limit){
                p1++;
                p2--;
                boat++;
                // break;
            }
            else if(add == limit){
                boat++;
                p1++;
                p2--;
            }
        }
        return boat;
    }
}