/*Linked List Data Structure are used to store a collection of items. Each item is stored in a node, and each node contains a reference (or link) to the
next node in the sequence. This allows for efficient insertion and deletion of items, as well as dynamic resizing of the list.

 * You can use the linkedlist to mimic stack and queue data structures.
 * for Stack use push() and pop() methods.
 * for queue we uuse offer() and poll() methods better than add() and remove() methods.
 * The offer() method is generally preferred over add() when working with queues because it is more flexible and can handle capacity restrictions more gracefully.
 * The difference between offer() and add() is that offer() returns false if the element cannot be added at this time due to capacity restrictions, while add() throws an IllegalStateException in such cases.
 * - Natural order = Ascending order for numbers, lexicographical for strings.
 * - Reverse order = Descending order for numbers, reverse lexicographical for strings.
 * And poll() retrieves and removes the head of the queue, or returns null if the queue is empty.
 */

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        System.out.println("Linked List: " + list);
        list.add(4, "R");
        System.out.println("After adding R at index 4: " + list);
        list.remove("R");
        System.out.println("After removing R: " + list);
        System.out.println("Popped element: " + list.pop());
        System.out.println("After popping: " + list);
    }
    
}
