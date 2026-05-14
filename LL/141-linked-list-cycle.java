
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