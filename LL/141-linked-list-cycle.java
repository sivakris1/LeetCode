//approach1: using hashset for checking node already present or not
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode ptr = head;
        //used for checking if present node already present in hashset if present then node was circular
        HashSet<ListNode> map = new HashSet<>();

        while(ptr != null){

            if(map.contains(ptr)){
                return true;
            }
            map.add(ptr);
            ptr = ptr.next;
        }
        return false;
    }
}


//approach2: using slow and fast pointers


public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}