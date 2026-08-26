
//approach1 : by using arraylists, assigning all values to arraylist and then updating new arraylist with old arraylist
class Solution {
    public int lastRemaining(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean isLeft = true;

        for(int i=1; i<=n; i++){
            ans.add(i);
        }

        while(ans.size() > 1){
            ArrayList<Integer> curr = new ArrayList<>();

            for(int i=0; i<ans.size(); i++){

                if(isLeft){
                    if(i % 2 == 0){
                      continue;
                  }
                }
                else{
                    if((ans.size() - i) % 2 != 0){
                        continue;
                    }
                }
                curr.add(ans.get(i));
            }

            ans = curr;

            isLeft = !isLeft;
        }

        return ans.get(0);
    }
}

//approach2
class Solution {
    public int lastRemaining(int n) {
        boolean isLeft = true;
        int remaining = n;
        int step = 1;
        int head = 1;

        while (remaining > 1) {
            
            if (isLeft || remaining % 2 == 1) {
                head = head + step;
            }

            remaining = remaining / 2;
            step = step * 2;
            isLeft = !isLeft;
        }

        return head;
    }
}