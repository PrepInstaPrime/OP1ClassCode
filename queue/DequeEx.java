import java.util.Deque;
import java.util.LinkedList;

public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> q= new LinkedList<>();
        // adding at first
        q.addFirst(4);
        q.addFirst(5);
        // adding from last
        q.addLast(6);
        System.out.println(q);
        // deleting from last
        q.removeLast();
        System.out.println(q);
        // deleting from first
        q.removeFirst();
        System.out.println(q);
        // insert 
        q.add(6);
        System.out.println(q);
    }
}
