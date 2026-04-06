package LinkedList;

class LLCycle2 {

    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null &&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow == fast){
                slow = head;

                while(slow!=fast){
                    slow = slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
