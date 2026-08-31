class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
         if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        ListNode prev = head;
        ListNode curr = head.next;
        int firstIdx = -1;
        int prevIdx = -1;
        int minDist = Integer.MAX_VALUE;
        int index = 1;

        while(curr.next != null){
            ListNode next = curr.next;

            boolean isCritical = (curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val);

            if(isCritical){
                if(firstIdx == -1){
                    firstIdx = index;
                }
                else{
                    minDist = Math.min(minDist, index - prevIdx);
                }

                prevIdx = index;
            }

            prev = curr;
            curr = next;
            index++;
        }

        if (minDist == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }
        int maxDist = prevIdx - firstIdx;
        return new int[]{minDist, maxDist};

    }
}