//approach1 : brute force approach with two loops 

class Solution {
    public int maximumSum(int[] nums) {
        int max = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int iSum = sumDigit(nums[i]);
                int jSum = sumDigit(nums[j]);

                if(iSum == jSum){
                    max = Math.max(max, nums[i]+nums[j]);
                }
            }
        }

        return max > 0 ? max : -1;
    }

    public int sumDigit(int number){
        int sum = 0;

        while(number > 0){
            int n = number % 10;
            sum += n;
            number = number/10;
        }

        return sum;
    }
}


//approach 2: optimized one. where we use hashmap for saving the sum of individual numbers for finding pairs

class Solution {
    public int maximumSum(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int sum = sumDigit(nums[i]);

            if(map.containsKey(sum)){
                int idx = map.get(sum);

                int totalSum = nums[idx] + nums[i];

                max = Math.max(max, totalSum);

                if(nums[i] > nums[idx]){
                    map.put(sum, i);
                }
            }
            else{
                map.put(sum, i);
            }
        }

        return max > 0 ? max : -1;
        

    }

    public int sumDigit(int number){
        int sum = 0;

        while(number > 0){
            int n = number % 10;
            sum += n;
            number = number/10;
        }

        return sum;
    }
}