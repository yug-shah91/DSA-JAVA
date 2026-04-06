package LinkedList;

// iteration method
class ReverseLL {
    Node head;

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void reverse(){

        if (head == null) return;
        Node prev = null;
        Node pres = head;

        while (pres!=null){
            Node next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
         //  if (next!=null) next = next.next;
        }
        head = prev;
    }
}
//  if(head == null){
//        return head;
//        }
//
//ListNode prev = null;
//ListNode pres = head;
//ListNode next = pres.next;
//
//        while(pres!=null){
//pres.next = prev;
//prev = pres;
//pres = next;
//            if(next!=null){
//next = next.next;
//            }
//                    }
//                    return prev;
//    }