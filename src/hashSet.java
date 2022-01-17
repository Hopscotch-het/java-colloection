import java.util.*;
public class hashSet {
    public static void main(String args[]){
        HashSet<Integer> s = new HashSet();
        s.add(10);
        s.add(20);
        s.add(10);
        s.add(0);
        s.add(20);
        System.out.println(s);

        System.out.println("is 10 in s: "+s.contains(10));

        System.out.println("is set empty: "+s.isEmpty());

        System.out.println("size of set: "+s.size());

        s.remove(0);
        System.out.println("After removing 0:"+s);

        System.out.println("Printing elemnts: ");
        Iterator i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
