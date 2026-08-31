class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = head;
        ListNode ans = dummy;
        int len = 0;
        int val1 = 0;
        int val2 = 0;

        while(dummy != null){
            len ++;
            if(len == k){
                val1 = dummy.val;
            }

            dummy = dummy.next;
        }

        dummy = head;

        int count = 0;
        while(dummy != null){
            count++;
            if((len-count)+1 == k){
                val2 = dummy.val;
                break;
            }

            dummy = dummy.next;
        }

        dummy = head;
        int idx = 0;

        while(dummy != null){
            idx++;

            if(idx == k){
                dummy.val = val2;
            }
            if(idx == count){
                dummy.val = val1;
            }

            dummy = dummy.next;
        }

        return ans;
    }
}