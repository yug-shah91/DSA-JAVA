package LinkedList;

import org.w3c.dom.NodeList;

class ReorderLL {
    ListNode head;
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head){

        ListNode fast = head;
       ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode present = head;

        while(present!=null){
          ListNode next = present.next;
            present.next = prev;
            prev = present ;
            present = next;
        }

        return prev;
    }

    // rearrange

    public void reorderList(ListNode head) {

        if (head == null || head.next==null){
            return;
        }

        ListNode middle = middleNode(head);
        ListNode hf = head;
        ListNode hs = reverse(middle);

        while (hf != null || hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf!=null){
            hf.next = null;
        }
    }
}
