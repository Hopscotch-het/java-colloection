import java.util.*;
public class linkedListTest {
    public static void main(String args[]){
        LinkedList<Integer> l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.addFirst(-100);
        l.addLast(100);
        System.out.println(l);
        System.out.println("Printing list in reverse order");

        Iterator it =l.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("l cointains 1: "+l.contains(1));

        System.out.println("first element of l: "+l.getFirst());
        System.out.println("last Element of l: "+l.getLast());

        System.out.println("Index of 2 : "+l.indexOf(2));

        System.out.println("using poll method : "+l.poll());

        l.remove(2);
        System.out.println(l+" size:"+l.size());

        Object[] t =l.toArray();
        System.out.println(t[0]);
        l.clear();
        System.out.println("After clear method"+l);
    }
}
