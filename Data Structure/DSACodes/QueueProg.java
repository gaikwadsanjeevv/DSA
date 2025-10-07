import java.util.LinkedList;
import java.util.Queue;

public class QueueProg {
    
    public static void main(String[] args) {
        
        Queue <String> queue = new LinkedList<String>();

        queue.offer("Sanjeev");
        queue.offer("Gaikwad");
        queue.offer("Nashik");
        queue.offer("USA");
        queue.offer("Paris");

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        //poll wont throw exception if queue is empty
    }

}
//where are queue suseful for

//1. keyboard buffer (Leters are typed in any order but they are displayed in the order they are typed)
//2. printer queue (documents are printed in the order they are sent to the printer)
//3. call center phone system (calls are answered in the order they are received)
//4. CPU task scheduling (processes are executed in the order they are added to the queue)
//5. breadth first search (BFS) algorithm (nodes are explored in the order they are discovered)
//6. handling of interrupts in real-time systems (interrupts are processed in the order they are received)
//7. managing requests in web servers (requests are handled in the order they are received)
//8. simulation of real-world queues (like lines at a grocery store or bank)
//9. message queuing systems (messages are processed in the order they are sent)
//10. order processing systems (orders are fulfilled in the order they are received)
//11. task scheduling in operating systems (tasks are executed in the order they are scheduled)
//12. event handling in graphical user interfaces (events are processed in the order they occur)
//13. data streaming applications (data packets are processed in the order they are received)
//14. multiplayer online games (actions are processed in the order they are performed by players)
//15. real-time data processing (data is processed in the order it is received)
//16. network packet scheduling (packets are transmitted in the order they are received)
//17. Used in LinkedLists, priority queues, and breadth-first search algorithms.
//18. Linked list is used to implement queue data structure.
//19. Priority queue is used in Dijkstra's shortest path algorithm and Huffman coding.
//20. Breadth-first search algorithm is used in finding the shortest path in unweighted graphs
//21. Queues are also used in various applications like CPU scheduling, disk scheduling, and
//print spooling.