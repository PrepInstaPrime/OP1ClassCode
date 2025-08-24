import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueEx {
    public static void main(String[] args) {
        // with the help of linkedlist
        Queue<Integer> q= new LinkedList<>();
        //Queue<Integer> q= new ArrayDeque<>();  // this is the faster in some operations
        // PriorityQueue<Integer> q= new PriorityQueue<>();
        // inserting element 
        q.add(2); // whenever there is no space in queue or u are not able to insert value then it will throw exception 
        q.offer(3);// whenever there is no space in queue or u are not able to insert value then it will return false
        System.out.println(q);
        // peek element 
        System.out.println(q.peek());
        // remove the value 
        System.out.println(q.poll());
        System.out.println(q.size()); // length of the queue
        System.out.println(q.isEmpty()); // check for empty

    }
}
