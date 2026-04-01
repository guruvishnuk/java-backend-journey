import java.util.*;

public class HashMapCore{
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"guruvishnu");
        map.put(2,"satyarth");  
        map.put(3,"satyarthh");

        System.out.println(map.get(1));

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}