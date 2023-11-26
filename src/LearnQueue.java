import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        //add a element in queue
        queue.offer(23);
        queue.offer(32);
        queue.offer(54);
        System.out.println(queue);
        //remove the head of the queue
        System.out.println(queue.poll());

        System.out.println(queue);
        //head of the queue
        System.out.println(queue.peek());

    }
}
