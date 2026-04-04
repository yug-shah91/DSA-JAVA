package LinkedList;

class ReversePartLL {
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

        public void reverseBetween(int left , int right){

            // dummy node to mark the head of the list
            Node dummy = new Node(0);
            dummy.next=head;

            //make markers for currNode and for the node before reversing
            Node leftPre = dummy;
            Node currNode = head;

            for (int i = 0 ; i< left -1 ; i++){
                leftPre=leftPre.next;
                currNode=currNode.next;
            }
            // Node to join later with the end
            Node subListHead = currNode;

            // reverse
            Node preNode = null;
            for (int i = 0 ; i<= right -left ; i++){
                Node nextNode = currNode.next;
                currNode.next = preNode;
                preNode = currNode;
                currNode = nextNode;
            }

            // join the piece
            leftPre.next = preNode;
            subListHead.next = currNode;
        }
    }
}
