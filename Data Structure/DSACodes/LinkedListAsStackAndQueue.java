import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class LinkedListAsStackAndQueue {

    public static void main(String[] args) {
        // Use LinkedList to implement a stack (LIFO: Last-In, First-Out)
        System.out.println("--- Demonstrating LinkedList as a Stack (LIFO) ---");
        Deque<String> stack = new LinkedList<>();

        // Stack operations: push() to add, pop() to remove
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack after pushing elements: " + stack);
        System.out.println("Popping element: " + stack.pop());
        System.out.println("Popping element: " + stack.pop());
        System.out.println("Stack after popping elements: " + stack);

        System.out.println("\n--- Demonstrating LinkedList as a Queue (FIFO) ---");
        // Use LinkedList to implement a queue (FIFO: First-In, First-Out)
        Queue<String> queue = new LinkedList<>();

        // Queue operations: offer() to add, poll() to remove
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Queue after offering elements: " + queue);
        System.out.println("Polling element: " + queue.poll());
        System.out.println("Polling element: " + queue.poll());
        System.out.println("Queue after polling elements: " + queue);
    }
}
