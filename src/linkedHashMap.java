import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String args[]){
        LinkedHashMap<Integer,String> map = new LinkedHashMap();

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"A");
        map.put(4,"C");
        map.put(1,"D");

        System.out.println("map: "+map.entrySet());

        System.out.println("key set: "+map.keySet());
        System.out.println("Values: "+map.values());
        System.out.println("is map empty: "+map.isEmpty());

        map.remove(1);
        System.out.println("After removing elemnt with key 1:");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        map.putIfAbsent(5,"V");
        System.out.println("After using putIfAbsent: "+map.entrySet());

        map.replace(5,"x");
        System.out.println("After replacing value of key 5"+map);

        System.out.println("size of map is: "+map.size());

        map.compute(2,(k,v)->v.concat(" abc"));
        System.out.println("After apply compute on key 2: "+map.get(2));

        System.out.println("Printing using forEach:");
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("does map contains key=2 :"+map.containsKey(2));
        System.out.println("does map contains Value=D :"+map.containsValue("D"));
    }
}
