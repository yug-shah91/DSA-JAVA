package LinkedList;


class PalindromeLL {



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

    public boolean isPalindrome(ListNode head) {

        ListNode mid = middleNode(head);
        ListNode headSecond = reverse(mid);
        ListNode reReverse = headSecond;

        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverse(reReverse);
        if(head == null || headSecond == null){
            return true;
        }
        return false;
    }
}

