package LinkedList;

import java.util.List;

class MergeSortedLL {

    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null){ // ek baar if statement chala uske baad else nai chale fir temo=tem.next hoga fir uske baad loop firse chalega
            if (list1.val<=list2.val){
                temp.next=list1;
                list1 = list1.next;
            }else {
                temp.next=list2;
                list2=list2.next;
            }
            temp = temp.next;
        }
        if (list1!=null){
            temp.next=list1;
        }else {
            temp.next=list2;
        }
        return dummy.next;
    }
}
