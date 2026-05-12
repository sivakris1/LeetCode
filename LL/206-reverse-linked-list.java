
class Solution {
    public ListNode reverseList(ListNode head) {

        //solving like two pointer technique by breaking next nodes and assigning to back nodes
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
          ListNode temp = curr.next;
          curr.next = prev;
          prev = curr;
          curr = temp;
        }

        return prev;
    }
}