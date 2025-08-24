import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> q= new PriorityQueue<>();
        q.offer(4);
        q.offer(3);
        q.offer(5);
        q.offer(7);
        q.offer(6);
        q.offer(1);
        System.out.println(q);
    }
}
