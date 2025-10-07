/*
 * Priority Queue implementation in Java
 * Demonstrates:
 * 1. PriorityQueue with Double (Natural & Reverse Order)
 * 2. PriorityQueue with String (Natural & Reverse Order)
 * 
 * Notes:
 * - Natural order = Ascending order for numbers, lexicographical order for strings.
 * - Reverse order = Descending order for numbers, reverse lexicographical for strings.
 */

import java.util.Collections;
import java.util.Queue;

public class PriorityQueue {

    public static void main(String[] args) {

        // ---------- 1️⃣ DOUBLE - NATURAL ORDER ----------
        Queue<Double> numQueue = new java.util.PriorityQueue<>();
        numQueue.offer(3.0);
        numQueue.offer(1.0);
        numQueue.offer(4.0);
        numQueue.offer(2.0);

        System.out.println("1️⃣ Double (Natural Order - Min Heap):");
        while (!numQueue.isEmpty()) {
            System.out.println(numQueue.poll());
        }

        // ---------- 2️⃣ DOUBLE - REVERSE ORDER ----------
        Queue<Double> numQueueRev = new java.util.PriorityQueue<>(Collections.reverseOrder());
        numQueueRev.offer(3.0);
        numQueueRev.offer(1.0);
        numQueueRev.offer(4.0);
        numQueueRev.offer(2.0);

        System.out.println("\n2️⃣ Double (Reverse Order - Max Heap):");
        while (!numQueueRev.isEmpty()) {
            System.out.println(numQueueRev.poll());
        }

        // ---------- 3️⃣ STRING - NATURAL ORDER ----------
        Queue<String> strQueue = new java.util.PriorityQueue<>();
        strQueue.offer("Banana");
        strQueue.offer("Apple");
        strQueue.offer("Cherry");
        strQueue.offer("Mango");

        System.out.println("\n3️⃣ String (Natural Order - Alphabetical):");
        while (!strQueue.isEmpty()) {
            System.out.println(strQueue.poll());
        }

        // ---------- 4️⃣ STRING - REVERSE ORDER ----------
        Queue<String> strQueueRev = new java.util.PriorityQueue<>(Collections.reverseOrder());
        strQueueRev.offer("Banana");
        strQueueRev.offer("Apple");
        strQueueRev.offer("Cherry");
        strQueueRev.offer("Mango");

        System.out.println("\n4️⃣ String (Reverse Order - Reverse Alphabetical):");
        while (!strQueueRev.isEmpty()) {
            System.out.println(strQueueRev.poll());
        }
    }
}
