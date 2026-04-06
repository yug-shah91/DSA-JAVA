package LinkedList;

class RotateList {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode rotateRight(ListNode head, int k) {
        if(k<0 || head == null || head.next==null){
            return head;
        }

        // Step 1: find length
        ListNode last = head;
        int length = 1;
        while (last.next!=null){
            last=last.next;
            length++;
        }
        // Step 2: make circular
        last.next=head;

        // Step 3: reduce k
        int rotations = k%length; // k = 7 → 7 % 5 = 2
        // Step 4: find new tail
        int skip = length-rotations;
        ListNode newLast = head;
        for (int i = 0 ; i< skip-1;i++){
            newLast = newLast.next;
        }
        // Step 5: break
        head = newLast.next;
        newLast.next=null;

        return head;
    }
}
