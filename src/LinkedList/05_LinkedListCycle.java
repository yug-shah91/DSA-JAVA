package LinkedList;

class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
    // length count

    public int LengthCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int count = 1;
                ListNode temp = slow.next;

                while (temp != slow.next) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0;
    }
}
