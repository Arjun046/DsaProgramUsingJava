import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.offer(23);
        arrayDeque.offerFirst(21);
        arrayDeque.offerLast(24);

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());


        System.out.println(arrayDeque.poll());
        System.out.println("poll():" +arrayDeque);
        System.out.println(arrayDeque.pollFirst());
        System.out.println("poll first:"+arrayDeque);
        System.out.println(arrayDeque.pollLast());
        System.out.println("poll last:"+arrayDeque);
    }
}
