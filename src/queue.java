import java.util.*;

public class queue {
    public static void main(String args[]){

        Queue<Integer> q=new LinkedList<>();
        q.add(-3);
        q.add(20);
        q.add(3);
        q.add(-40);
        q.offer(50);
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q);

        for(Integer s:q){
            System.out.print(s+" ");
        }
    }
}