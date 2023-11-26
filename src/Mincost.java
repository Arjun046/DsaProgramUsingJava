import java.util.PriorityQueue;

public class Mincost {
     static int mincost(int a[]){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
            priorityQueue.add(a[i]);
        }
        int ans=0;
        while (priorityQueue.size()>1){
            int first=priorityQueue.poll();
            int second=priorityQueue.poll();
            int sum=first+second;
            ans+=sum;
            priorityQueue.add(sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={2,5,4,8,6,9};
        System.out.println(mincost(a));

    }
}
