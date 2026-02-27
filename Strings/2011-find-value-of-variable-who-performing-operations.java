class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for(int i=0;i<operations.length;i++){

            // In string == checks whether two strings points to same object or not but equals checks exact value
            if(operations[i].equals("X--") || operations[i].equals("--X")){
                x--;
            }
            else{
                x++;
            }
        }
        return x;
    }
}