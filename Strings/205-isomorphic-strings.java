class Solution {
    public boolean isIsomorphic(String s, String t) {

        //256 size array cause all capital,small and special characters
        int[] arrS = new int[256];
        int[] arrT = new int[256];

        for(int i=0;i<s.length();i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if(arrS[chS] != arrT[chT]){
                return false;
            }

            //instead of storing frequency just store their timeline as index so we can know whether they point to each other later
            arrS[chS] = i+1;
            arrT[chT] = i+1;
        }

        return true;
    }
}