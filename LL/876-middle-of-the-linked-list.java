//approach: If fast ends to list and no node left on right of the fast then it is even
        //  If fast ends to list and still node left on right of the fast then it was odd
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode ans = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next == null){
            temp = slow;
        }
        else{
            temp = slow.next;
        }

       

        // while(temp.next != null){
        //     temp = temp.next;
        // }

        return temp;
    }
}