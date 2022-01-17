import java.util.Vector;

public class vector {
    public static void main(String args[]){
        Vector<Integer>  v =new Vector<>();

        System.out.println("Capcity of vector: "+v.capacity());
        System.out.println("is vector empty: "+v.isEmpty());

        v.add(10);
        v.add(2);
        v.add(-10);
        v.addElement(5);
        v.addElement(20);

        System.out.println("vector: "+v);
        System.out.println("is vector empty: "+v.isEmpty());

        System.out.println("does vector contains 5"+v.contains(5));

        System.out.println("first element of vector is : "+v.firstElement());
        System.out.println("last element of vector is : "+v.lastElement());

        System.out.println("removing 5 from vector: "+v.removeElement(5));
        System.out.println("After removing 5 from vector: "+v);

        v.removeElementAt(0);
        System.out.println("After removing element from 0 index: "+v);

        System.out.println("Hash code of this vector = "+v.hashCode());

        System.out.println("Element at index 1 is = "+v.get(1));
    }
}
