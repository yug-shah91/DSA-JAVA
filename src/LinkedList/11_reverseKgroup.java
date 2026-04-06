package LinkedList;

class reverseKgroup {

       public class ListNode {
           int val;
           ListNode next;
           ListNode() {}
           ListNode(int val) { this.val = val; }
           ListNode(int val, ListNode next) { this.val = val; this.next = next; }
       }
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode before= dummy;

        while(true){

            ListNode end = before;
            for(int i = 0 ; i< k && end!=null;i++){
                end = end.next;
            }

            if(end == null) break;

            ListNode start = before.next;
            ListNode after = end.next;

            ListNode prev = after;
            ListNode curr = start;

            while(curr!=after){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            before.next = end;
            before = start;
        }
        return dummy.next;
    }
}
