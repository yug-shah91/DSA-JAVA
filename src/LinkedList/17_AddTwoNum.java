package LinkedList;

class AddTwoNum {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Fake starting node 👉 Helps build result easily
        ListNode temp = dummy; //This will move and build the answer list

        int carry = 0; //Stores carry (like normal addition)

        while(l1!=null || l2!=null || carry!=0){ //Loop runs until: both lists finished AND no carry left

            int sum  = carry; //Start with carry from previous step

            if(l1!=null){ //Add digit 👉 Move pointer forward
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }

            carry = sum/10; // sum = 15 → carry = 1


            temp.next = new ListNode(sum%10); // sum = 15 → digit = 5
            temp = temp.next; // sum = 15 → digit = 5
        }
        return dummy.next;
    }
}
