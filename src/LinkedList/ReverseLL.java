package LinkedList;

// iteration method
public class ReverseLL {
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

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while (pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next!=null) next = next.next;
        }
        head = prev;
    }
}