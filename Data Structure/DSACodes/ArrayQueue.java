public class ArrayQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    // Constructor to initialize the queue
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1; // Indicates an empty queue
        size = 0;
    }

    // Insert an element at the rear of the queue (enqueue)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment for rear
        arr[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    // Remove and return the element from the front of the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Or throw an exception
        }
        int removedItem = arr[front];
        front = (front + 1) % capacity; // Circular increment for front
        size--;
        System.out.println("Dequeued: " + removedItem);
        return removedItem;
    }

    // Return the element at the front of the queue without removing it (peek)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            return -1; // Or throw an exception
        }
        return arr[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get the current size of the queue
    public int size() {
        return size;
    }

    // Display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5); // Create a queue with capacity 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Front element: " + queue.peek());

        queue.dequeue();
        queue.display();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This will attempt to enqueue but the queue is full
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());
    }
}