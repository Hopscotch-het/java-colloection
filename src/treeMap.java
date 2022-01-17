import java.util.TreeMap;

public class treeMap {
    public static void main(String args[]){
        TreeMap<Integer,String> map =new TreeMap();

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"A");
        map.put(7,"C");
        map.put(1,"D");

        System.out.println("Ceiling of key 5: "+map.ceilingEntry(5));

        System.out.println("First key: "+map.firstEntry());
        System.out.println("Last key: "+map.lastEntry());

        map.replace(2,"xyz");
        System.out.println("After replacing key 2 with new value: "+map);

        System.out.println("Head map: "+map.headMap(2,true));
        System.out.println("tail map: "+map.tailMap(2,false));
        System.out.println("sub map: "+map.subMap(2,true,7,false));

        System.out.println("Descending map: "+map.descendingMap());

        System.out.println("Traversing map:");
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("does map contains key=1: "+map.containsKey(1));
        System.out.println("does map contains value=A: "+map.containsValue("A"));
    }
}
