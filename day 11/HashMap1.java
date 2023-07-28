import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class HashMap1 {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.put(4, "Grapes");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.putIfAbsent(103, "Gaurav");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();// Creating HashMap
        map1.put(5, "Mango");
        map1.put(6, "Apple");
        map1.put(7, "Banana");
        map1.put(8, "Grapes");
        map.putAll(map1);
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.remove(1);
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.replace(103, "Tommy");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.replaceAll((k, v) -> "Ajay");
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}