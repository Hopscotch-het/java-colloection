import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String args[]){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(7);
        queue.add(5);
        queue.add(9);

        Iterator it = queue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Head element: "+queue.peek());
        queue.poll();
        System.out.println("After performing poll operation on queue: "+queue);

        queue.offer(1);
        System.out.println("After performing offer(1) operation on queue: "+queue);

    }
}
