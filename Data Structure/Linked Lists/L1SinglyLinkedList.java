public class L1SinglyLinkedList<T> {
    //Node inner class for SLL
    public class Node{
        public T data; //Data to store (could be int, string, Object etc)
        public Node nextNode; //Pointer to next node in list

    }

    public Node headNode; //head node of the linked list
    public int size;      //size of the list

    //constructor
    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }
}
