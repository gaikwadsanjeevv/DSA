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
    }

}