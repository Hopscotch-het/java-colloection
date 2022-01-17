import java.util.Hashtable;

public class hashTable {
    public static void main(String args[]){
        Hashtable<Integer,String > table = new Hashtable<>();
        table.put(10,"A");
        table.put(20,"B");
        table.put(30,"C");
        table.put(40,"D");
        table.put(50,"E");
        table.put(60,"F");

        System.out.println("Size of table: "+table.size());

        System.out.println("does hash table contains key=1: "+table.containsKey(1));
        System.out.println("does hash table contains value=A: "+table.containsValue("A"));

        table.replace(30,"abc");
        System.out.println("After replacing key 30 with value abc:"+table);

        System.out.println("All keys: "+table.keySet());
        System.out.println("All values: "+table.values());

        System.out.println("hash code of table: "+table.hashCode());

        System.out.println("using toString method: "+table.toString());

        System.out.println("Value of element having key=20: "+table.get(20));
    }
}
