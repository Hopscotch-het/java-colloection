import java.util.*;
public class arrayList {
    public static void main(String args[]){
        ArrayList<Integer> l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(20);

        ArrayList<Integer> l1 = new ArrayList();
        l1.add(8);
        l1.add(15);

        l.addAll(0,l1);
        System.out.println(l);

        System.out.println("l is empty:"+l.isEmpty());

        Collections.sort(l);
        System.out.println("Printing all elements: ");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        l.remove(0);
        System.out.println("Printing all elements after removing elemnet from 0 index: "+l);

        l.set(1,-100);
        System.out.println("printying all elemsnts after setting first element to -100: "+l);
    }
}
