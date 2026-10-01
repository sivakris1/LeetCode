class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while(read < chars.length){
            char current = chars[read];
            int count = 0;

            while(read < chars.length && chars[read] == current){
                read++;
                count++;
            }

            chars[write] = current;
            write++;

            if(count > 1){
                for(char digit : Integer.toString(count).toCharArray()){
                    chars[write] = digit;
                    write++;
                }
            }
        }

        return write;
    }
}