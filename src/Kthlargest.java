import java.util.Iterator;
import java.util.PriorityQueue;

public class Kthlargest {
    static int kthlargest(int[] a, int k, int i) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (i = 0; i < k; i++) {
            priorityQueue.add(a[i]);
        }
        for (i = k; i < a.length; i++) {
            if (priorityQueue.peek() < a[i]) {
                priorityQueue.poll();
                priorityQueue.add(a[i]);
            }
        }
        return priorityQueue.peek();
    }


    public static void main(String[] args) {
        int a[]={ 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45};
        int n=a.length;
        int k=3;
        System.out.println(kthlargest(a,n,k));

    }
}
