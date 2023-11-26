import java.util.Comparator;
import java.util.PriorityQueue;

public class Learnpriorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(2);
        pq.offer(33);
        pq.offer(32);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
