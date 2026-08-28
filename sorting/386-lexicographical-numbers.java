
//approach : add the values to arraylist first and then sort them in lexicographical order
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();

        for(int i=1; i<=n; i++){
            ans.add(i);
        }

        ans.sort((a,b) -> String.valueOf(a).compareTo(String.valueOf(b)));

        return ans;
    }
}