import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String args[]){
        TreeSet<Integer> set = new TreeSet();
        Collections.addAll(set,10,20,3,4,7,6);

        set.add(10);
        set.add(-4);
        set.add(-3);

        System.out.println(set);

        System.out.println("Ceiling of 9 in set: "+set.ceiling(9));
        System.out.println("Floor of 9 in set: "+set.floor(9));

        System.out.println("Traversing list in descending order: ");
        Iterator it = set.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        System.out.println("Highest Value: "+set.pollFirst());
        System.out.println("Lowest Value: "+set.pollLast());

        System.out.println("After poll"+set);

        System.out.println("Head set: "+set.headSet(3));
        System.out.println("Tail set: "+set.tailSet(7));
        System.out.println("Subset: "+set.subSet(3,7));

    }
}