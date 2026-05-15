
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        ListNode tail = head;
        ListNode ans = tail;
        while(temp.next != null){
            len ++;
            temp = temp.next;
        }

        if(len == 0){
            return null;
        }

        if(len < n){
            return head.next;
        }

        int val = len - n;

        int i = 0;
        while(i <= val-1){
            tail = tail.next;
            i++;
            // if(i == n){
            //     tail.next = null;
            // }
        }

        tail.next = tail.next.next;
        return ans;
    }
}