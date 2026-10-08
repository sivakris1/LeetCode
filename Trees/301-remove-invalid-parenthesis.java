import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(s);
        visited.add(s);

        boolean foundValidLevel = false;

        while (!queue.isEmpty()) {
            String curr = queue.poll();

            if (isValid(curr)) {
                result.add(curr);
                foundValidLevel = true; 
            }

            if (foundValidLevel) continue;

            for (int i = 0; i < curr.length(); i++) {
                char c = curr.charAt(i);

                if (c != '(' && c != ')') continue;

                String nextStr = curr.substring(0, i) + curr.substring(i + 1);

                if (!visited.contains(nextStr)) {
                    visited.add(nextStr);
                    queue.offer(nextStr);
                }
            }
        }

        return result;
    }

    private boolean isValid(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') count++;
            else if (c == ')') {
                count--;
                if (count < 0) return false; 
            }
        }
        return count == 0;
            }
}
