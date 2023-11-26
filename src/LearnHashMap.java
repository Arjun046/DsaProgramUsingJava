import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnHashMap {
    public static void main(String[] args) {
       // Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> map=new TreeMap<>();

        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
//        if(!map.containsKey("two")){
//            map.put("two",23);
//        }
        map.putIfAbsent("two",23);



        for (Map.Entry<String,Integer> e: map.entrySet()
             ) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            
        }
        for (String key: map.keySet()
             ) {
            System.out.println(key);
            
        }
        System.out.println(map);
    }
}
